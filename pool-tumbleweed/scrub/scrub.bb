SUMMARY = "Disk scrubbing program"
DESCRIPTION = "Scrub writes patterns on files or disk devices to make \
retrieving the data more difficult.  It operates in one of three modes: \
1) the special file corresponding to an entire disk is scrubbed \
   and all data on it is destroyed. \
2) a regular file is scrubbed and only the data in the file \
   (and optionally its name in the directory entry) is destroyed. \
3) a regular file is created, expanded until \
   the file system is full, then scrubbed as in 2)."
LICENSE = "GPL-2.0-only"

PV = "2.6.1"

RPM_NAME = "scrub-2.6.1-2.8.aarch64.rpm"
RPM_HASH = "75d8465bb88670a49f748293636414b1e3bb2ce0d2a558eaec7dd9218172b62436c375205e05fadebe0f9306c97e35afa802929d996dc607124274ac4b40eb74"

RPROVIDES:${PN} += "scrub"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
