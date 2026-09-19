SUMMARY = "X graphics demo"
DESCRIPTION = "xgc is an X11 graphics demo that shows various features of the X11 \
core protocol graphics primitives."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "xgc-1.0.7-1.4.aarch64.rpm"
RPM_HASH = "056d9696c38770468263c0f38cae965230acda409e79294880daa3992ae797f67990e279e22df42728dff55b80eef059a7161a5594dedf8089215e4fce536ccf"

RPROVIDES:${PN} += "xgc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
