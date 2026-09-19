SUMMARY = "IBM JFS Utility Programs"
DESCRIPTION = "This package contains utilities for managing IBM's Journaled File \
System (JFS) under Linux.  The following utilities are available: \
 \
o fsck.jfs--initiate replay of the JFS transaction log and check and \
repair a JFS formatted device o logdump--dump a JFS formatted device's \
journal log o logredo--replay a JFS formatted device's journal log o \
mkfs.jfs--create a JFS formatted partition o xchkdmp--dump the contents \
of a JFS fsck log file created with xchklog o xchklog--extract a log \
from the JFS fsck workspace into a file o xpeek--shell-type JFS file \
system editor"
LICENSE = "GPL-2.0-or-later"

PV = "1.1.15"

RPM_NAME = "jfsutils-1.1.15-21.11.aarch64.rpm"
RPM_HASH = "98287d20fa97646838304b6fc918a4de0f82676ef5af188efa16efd5a3f075bc5d6163fa5f5615d41b93be2d0d5e6ced5f162e99d13e7c35f000149c4b357cfa"

RPROVIDES:${PN} += "jfsprogs \
jfsutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libuuid.so.1"

inherit rpm
