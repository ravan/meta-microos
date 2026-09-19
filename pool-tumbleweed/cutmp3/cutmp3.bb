SUMMARY = "Command line based lossless MP3 editor"
DESCRIPTION = "This is a program to split MP3 files without quality loss, using an \
ncurses-based user interface. Beginning and end of a segment can be \
marked with the 'a' and 'b' keys and the segment be saved with 's'. \
VBR files are supported. Using a timetable with VBR files will not be \
as precise as with CBR files, though."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.3"

RPM_NAME = "cutmp3-3.0.3-2.5.aarch64.rpm"
RPM_HASH = "04b43820ead74b283ff8f61559f41e1d550d3c6a44d8aaf477d289490afcf096cf944d36b4de8e668f128492af24fd9578b30d1eec25553e9b74a8edca6554d3"

RPROVIDES:${PN} += "cutmp3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libreadline.so.8 \
mpg123"

inherit rpm
