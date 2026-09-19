SUMMARY = "Select 3D Athena Widgets as a replacement for Athena Widgets"
DESCRIPTION = "Installation of this package will cause programs utilizing the Athena \
Widget Toolkit to instead use the 3D Athena Widget set. \
 \
If any problems arise using or starting X Window System programs, \
remove this package."
LICENSE = "MIT"

PV = "1.6.6"

RPM_NAME = "xaw3dd-1.6.6-1.9.aarch64.rpm"
RPM_HASH = "16d7bbe415e4fc61963dd812766a5053a91fe8f73f0b36f7032c081c0f93c9493c8c4886d665487ea6d0c377bbd7498d737a1ea0bdfa0a51f7bd5bfa7023bfe8"

RPROVIDES:${PN} += "config-xaw3dd \
libXaw.so.6 \
libXaw.so.7 \
libXaw.so.8 \
xaw3dd"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw3d6 \
libXaw3d7 \
libXaw3d8 \
libXext.so.6 \
libXmu.so.6 \
libXpm.so.4 \
libXt.so.6 \
libc.so.6"

inherit rpm
