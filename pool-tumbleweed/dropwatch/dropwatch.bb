SUMMARY = "Kernel dropped packet monitor"
DESCRIPTION = "dropwatch is an interactive utility for monitoring and recording packets that \
are dropped by the kernel"
LICENSE = "GPL-2.0-only"

PV = "1.5.5"

RPM_NAME = "dropwatch-1.5.5-1.6.aarch64.rpm"
RPM_HASH = "a636eb8376a61148d8d1ec9f351922c1af7a22255752ba396d555f12f875b0fb5305dcdaa0b0913cd936952540d508ec9aaa11775360bb852981a0cee7367f75"

RPROVIDES:${PN} += "dropwatch"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libpcap.so.1 \
libreadline.so.8 \
libsframe.so.2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
