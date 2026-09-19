SUMMARY = "A Monitoring and Testing Tool for Linux kernel thermal subsystem"
DESCRIPTION = "This tool is conceived as a tool to help visualize, tune, and test the \
complex thermal subsystem."
LICENSE = "GPL-2.0-only"

PV = "1.0.gb61442df748f06e9"

RPM_NAME = "tmon-1.0.gb61442df748f06e9-1.17.aarch64.rpm"
RPM_HASH = "bbd14e94f3d656ef6bfff928be4c968ac09a2f433d9638c01d897686f8a9d6770a1b859e2ca2011d0cbd626ec57a18f5a44fdd830c692020a14b0f08e779fc0c"

RPROVIDES:${PN} += "tmon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6"

inherit rpm
