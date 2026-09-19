SUMMARY = "Filesystem benchmark"
DESCRIPTION = "The fs_mark benchmark tests synchronous write workloads. It can vary the number \
of files, directory depth, etc. It has detailed timings for reads, writes, \
unlinks and fsyncs that make it good for simulating mail servers and other \
setups."
LICENSE = "GPL-2.0+"

PV = "3.3"

RPM_NAME = "fs_mark-3.3-3.9.aarch64.rpm"
RPM_HASH = "135f6ba8492f1312bb7dffcc6d50f5423997c68dd539633159b4eaf1c3cdac530fbebe02d9fa68b1b14898c0f337c751de4e6550106f775b8cfe67dbb766f05b"

RPROVIDES:${PN} += "fs-mark"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
