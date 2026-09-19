SUMMARY = "GCC plugins development enviroment"
DESCRIPTION = "Files required for developing and compiling GCC plugins."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "gcc16-devel-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "1a80fd66a14982841e1547fd3be97216399991417f1e81f7c9faaff5ee8d4b1f6ce6843d676d1c4399e5a15199982836437a75600c0ff0211795fe30df121e02"

RPROVIDES:${PN} += "gcc16-devel"

RDEPENDS:${PN} += "gcc16 \
gmp-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
mpc-devel"

inherit rpm
