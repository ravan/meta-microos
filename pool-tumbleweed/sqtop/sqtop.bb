SUMMARY = "'top' for Squid proxy process"
DESCRIPTION = "Console applicaton to display information about currently active client connections for a Squid proxy in a convenient way."
LICENSE = "GPL-2.0+"

PV = "2015.02.08"

RPM_NAME = "sqtop-2015.02.08-1.32.aarch64.rpm"
RPM_HASH = "54a20f6af0639d57fa431ec82eb098e4447b728074eda239332134837899e7c40dfa45c9e62ac2a175ed42da13e32ec467b3bf674c65941e837094518d9f983a"

RPROVIDES:${PN} += "sqtop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libncurses.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
