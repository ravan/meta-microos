SUMMARY = "Kernel latency measuring tool"
DESCRIPTION = "LatencyTOP is a Linux* tool for software developers (both kernel and \
userspace), aimed at identifying where in the system latency is \
happening, and what kind of operation/action is causing the latency to \
happen so that the code can be changed to avoid the worst latency \
hiccups. A version with graphic interface is available as xlatencytop."
LICENSE = "GPL-2.0"

PV = "0.5"

RPM_NAME = "latencytop-0.5-26.8.aarch64.rpm"
RPM_HASH = "7f8b314b2ac4f9df3973e9cbecd41ced3b4b8852a505b456d55a28b1c05823e9478c7758d90a3ba38f4bb431663e04aafc607be1a9329c3d99ed2844b44d7077"

RPROVIDES:${PN} += "latencytop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
