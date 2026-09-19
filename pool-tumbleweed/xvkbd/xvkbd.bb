SUMMARY = "Virtual Keyboard for the X Window System"
DESCRIPTION = "Xvkbd is a virtual (graphical) keyboard program for the X Window System \
which provides a facility to enter characters onto other clients \
(software) by clicking on an on-screen keyboard."
LICENSE = "GPL-2.0-or-later"

PV = "4.1"

RPM_NAME = "xvkbd-4.1-2.9.aarch64.rpm"
RPM_HASH = "26d55cd2bbadb9eca933c17962717756af3569eda00fe580bb7de54cc22babd32fcf0ddaa302e366c3588c94837d7d7ae7c0d9befe94fa12119516fce5a9505b"

RPROVIDES:${PN} += "xvkbd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw3d.so.8 \
libXmu.so.6 \
libXt.so.6 \
libXtst.so.6 \
libc.so.6"

inherit rpm
