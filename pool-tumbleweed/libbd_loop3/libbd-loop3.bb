SUMMARY = "The loop plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides functionality related to loop devices."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_loop3-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "8ec2848362c27c472f1aa8453525abd95f2bac673db193cf871eb6ecd3a5f9de9439c578b30cf527347e0d1089195c5dbd0f86caa438ef4eab3504d391dc15a0"

RPROVIDES:${PN} += "libbd-loop.so.3 \
libbd-loop3 \
libblockdev-loop"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbd-utils.so.3 \
libbd-utils3 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
