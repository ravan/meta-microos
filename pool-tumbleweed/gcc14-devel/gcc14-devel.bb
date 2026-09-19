SUMMARY = "GCC plugins development enviroment"
DESCRIPTION = "Files required for developing and compiling GCC plugins."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "gcc14-devel-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "8749f7ddb91dfd95e36572bcaa200bf234b25a5fc5c2568ad9bae87727274836d5fb17dcfa1dffad11c556de7cf982539e918af057ec68dc38ff7dfa318cf9ff"

RPROVIDES:${PN} += "gcc14-devel"

RDEPENDS:${PN} += "gcc14 \
gmp-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
mpc-devel"

inherit rpm
