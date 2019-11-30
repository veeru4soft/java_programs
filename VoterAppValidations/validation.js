function validate(frm) {
	frm.vflag.value = "yes";
	document.getElementById("nameErr").innerHTML = "";
	document.getElementById("ageErr").innerHTML = "";
	document.getElementById("nameErr").style="color:red";
	document.getElementById("ageErr").style="color:red";
	
	var name = frm.pname.value;
	var age = frm.page.value;
	if(name =="") {
		document.getElementById("nameErr").innerHTML="Person Name is mandatory";
		frm.pname.focus();
		return false;
	}
	
	if(age =="") {
		document.getElementById("ageErr").innerHTML="Person age is mandatory";
		frm.page.focus();
		return false;
	}
	else {
		if(isNaN(age)) {
			document.getElementById("ageErr").innerHTML="Person age is must be a numeric";
			frm.page.focus();
			return false;
		}
	}
}