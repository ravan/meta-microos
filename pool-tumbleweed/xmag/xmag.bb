SUMMARY = "Screen magnifier"
DESCRIPTION = "xmag displays a magnified snapshot of a portion of an X11 screen."
LICENSE = "X11"

PV = "1.0.8"

RPM_NAME = "xmag-1.0.8-1.12.aarch64.rpm"
RPM_HASH = "e0e11cf5cb2f92974fe02861ff0ff7b9067fac4fa9c72b39a32be987bb6e1e65bd36d784071b23f44799af7e611b7b724f648b1e965b3ded0857c4a5a09da5d7"

RPROVIDES:${PN} += "xmag"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
