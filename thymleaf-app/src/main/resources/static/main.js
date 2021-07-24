$('document').ready(function(){
	
	$('.table .warn').on('click',function(event){
		event.preventDefault();
		var href=$(this).attr('href');
		$.get(href,function(student,status){
			$('#IdEdit').val(student.id);
			$('#nameEdit').val(student.name);
			$('#departmentEdit').val(student.department);
			$('#updatedByEdit').val(student.updatedBy);
			$('#updateOnEdit').val(student.updateOn.substr(0,10));
			
		});
		var modal = document.getElementById("editModal");
        var span = document.getElementsByClassName("close-Edit")[0];
        modal.style.display = "block";
        span.onclick = function() {
               modal.style.display = "none";
        }
		
	});
	$('.table #deleteButton').on('click',function(event){
		event.preventDefault();
		var href=$(this).attr('href');
		$('#deleteModal #delRef').attr('href',href);
	    var modal = document.getElementById("deleteModal");
        var span = document.getElementsByClassName("close-delete")[0];
        modal.style.display = "block";
       span.onclick = function() {
               modal.style.display = "none";
        }
     // $('#deleteModal').modal();
	});
});