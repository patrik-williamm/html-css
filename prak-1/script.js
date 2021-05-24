
var judul = document.getElementById('profile');

judul.style.backgroundColor = 'red';

//membuat objek

var mhs = {
	nama : 'patrik william',
	nim : 191289,
	jurusan : 'sisteminformasi',
	kelas : 'h',
	semester : 3,
	dataMhs : function() {
		return nama + nim + jurusan + kelas + semester;
	}
};