SUMMARY = "Utility to set an X Input device as the main pointer"
DESCRIPTION = "Xsetpointer sets an XInput device as the main pointer."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "xsetpointer-1.0.1-9.38.aarch64.rpm"
RPM_HASH = "52d36c05c4e18e806cccea7edb56a112f80c5474046de1d893759264efdaa7590f99f93506cfe2d85674011010ca7b42106728945b144e517c9e9aebb778f1a2"

RPROVIDES:${PN} += "xsetpointer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libc.so.6"

inherit rpm
