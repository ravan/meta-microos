SUMMARY = "X Session Manager Proxy"
DESCRIPTION = "smproxy allows X applications that do not support X11R6 session \
management to participate in an X11R6 session."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "smproxy-1.0.8-1.5.aarch64.rpm"
RPM_HASH = "c2e8c23825d2ed136a033c6ca5161b328cfb59458cc7c79a7f911472f5ced33c4dbc8a15d244b62c07610c9525f93f830e4658c8c19251158d82dd4629cf1b30"

RPROVIDES:${PN} += "smproxy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libXmuu.so.1 \
libXt.so.6 \
libc.so.6"

inherit rpm
