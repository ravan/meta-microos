SUMMARY = "Teletext and Videotext Decoder for the BTTV Driver"
DESCRIPTION = "AleVT is a teletext and videotext decoder and browser for the BTTV \
driver (/dev/vbi) and the X Window System.  It features multiple \
windows, a page cache, regexp searching, a built-in manual, and more. \
There is also a program to get the time from teletext."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.2"

RPM_NAME = "alevt-1.8.2-1.7.aarch64.rpm"
RPM_HASH = "8c867bacd07cdb1603a5a02d5cdcc8b178e245c07df224a6c41a4949f40dd31927f93a80325e88580ef7e1505ae26a363fef98aade735d4b69822f505b383f49"

RPROVIDES:${PN} += "alevt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libpng16.so.16 \
libzvbi.so.0"

inherit rpm
