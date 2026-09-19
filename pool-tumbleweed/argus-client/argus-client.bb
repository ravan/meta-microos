SUMMARY = "Client for Network Monitoring Tool"
DESCRIPTION = "Client for Argus network monitoring tool."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.8.2"

RPM_NAME = "argus-client-3.0.8.2-4.10.aarch64.rpm"
RPM_HASH = "97813c263df4eff431a767ac6c1615469c4ad12405d3208679f1c7d4ead2a3179784a057f2f95479b9ea7bfd9b9c4a6c16de0652a49d36c43a7c65e7e39c9827"

RPROVIDES:${PN} += "argus-client \
config-argus-client"

RDEPENDS:${PN} += "/usr/bin/perl \
argus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncurses.so.6 \
libreadline.so.8 \
libtinfo.so.6 \
libwrap.so.0"

inherit rpm
