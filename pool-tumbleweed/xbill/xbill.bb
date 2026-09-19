SUMMARY = "Classic X Game"
DESCRIPTION = "Ever get the feeling that nothing is going right? You're a sysadmin, and someone's trying to destroy your computers. The little people running around the screen are trying to infect your computers with Wingdows [TM], a virus cleverly designed to resemble a popular operating system. Additionally, some computers are connected with network cables. When one computer on a network becomes infected, a spark will be sent down the cable, and will infect the computer on the other end when it reaches there."
LICENSE = "GPL-1.0-or-later"

PV = "2.1"

RPM_NAME = "xbill-2.1-1.5.aarch64.rpm"
RPM_HASH = "f0c95de9fe9d5a66363ab60b9e6cecd32e5df7b84526342bf3d121ed68ca20639db07a489ed7283478db52dc257cdb8e87452d17d2146504e77f41db542bbc79"

RPROVIDES:${PN} += "xbill"

RDEPENDS:${PN} += "group-games \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXpm.so.4 \
libXt.so.6 \
libc.so.6 \
permissions \
user-games"

inherit rpm
