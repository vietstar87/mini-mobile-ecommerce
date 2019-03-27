var formId;
  function viewDetail(requestFormId) {
    $.get("/jiwoo/loan/"+requestFormId, function (data) {
      formId = requestFormId;
      $('#cusName').val(data.cusName);
      $('#cusEmail').val(data.cusEmail);
      $('#cusPhoneNo').val(data.cusPhoneNo);
      $('#cusAddress').val(data.cusAddress);
      $('#cusIdentityNo').val(data.cusIdentityNo);
      // $('#bankId').val(data.bankId);
      $('#bankName').val(data.bankName);
      $('#bankAccountNo').val(data.bankAccountNo);
      $('#reason').val(data.reason);
      $('#cmtTruoc').attr("src",data.indentityImageFront);
      $('#cmtSau').attr("src",data.indentityImageBack);
      $('#hochieu').attr("src",data.passportImage);
      $('#salary').attr("src",data.salaryImage);
      $('#hochieu').attr("src",data.passportImage);
      $('#bankAccountImage').attr("src",data.bankAccountImage);
      $('#otherDocs').attr("src",data.otherDocImage);
      // $('#reason').attr("src",data.otherDocImage);

      if(data.status == -1){
        $('#rejectBtt').hide();
        $('#approveBtt').hide();
        $('#rejectedBtt').show();
        $('#approvedBtt').hide();
      }else if(data.status == 0){
        $('#rejectBtt').show();
        $('#approveBtt').show();
        $('#rejectedBtt').hide();
        $('#approvedBtt').hide();
      }else if(data.status == 1){
        $('#rejectBtt').hide();
        $('#approveBtt').hide();
        $('#rejectedBtt').hide();
        $('#approvedBtt').show();
      }
    });
    $('#detail_form_modal').modal();
  }


var _status;
$('#rejectBtt').click(function () {
  _status = -1;
  $('#input-reason').modal();
});  
$('#approveBtt').click(function () {
  _status = 1;
  $('#input-reason').modal();
});  

$('#confirmBtt').click(function () {
    var _requestFormId = formId;
    var _reason= $('#reasontxt').val();
    var params = {
                    requestFormId: _requestFormId,
                    reason: _reason,
                    status : _status
                };
    $.ajax({
      url:'/jiwoo/editRequestForm/',
      type:"POST",
      data:JSON.stringify(params),
      contentType:"application/json; charset=utf-8",
      dataType:"json",
      success: function(data){
        if(data > 0){
          alert("Cập nhật trạng thái thành công!");
          location.reload();
        }else{
          alert("Không cập nhật được trạng thái");
        }
      },
      error: function () {
        alert("Có lỗi xảy ra");
      }
    });
  });