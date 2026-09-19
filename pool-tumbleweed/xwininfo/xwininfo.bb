SUMMARY = "Window information utility for X"
DESCRIPTION = "xwininfo prints information about windows on an X server."
LICENSE = "MIT"

PV = "1.1.7"

RPM_NAME = "xwininfo-1.1.7-1.2.aarch64.rpm"
RPM_HASH = "c17a36877f4dfa29e19264ff6d841754f28fdbdd68b16396f22ca41d84ed3c5657e8f35252860f930cb19cac8006ebaa4908d6edc053d2c332c462bb59f39984"

RPROVIDES:${PN} += "xwininfo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb-shape.so.0 \
libxcb.so.1"

inherit rpm
