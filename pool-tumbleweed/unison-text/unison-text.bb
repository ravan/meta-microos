SUMMARY = "File synchronization tool"
DESCRIPTION = "Text based userinterface for Unison. \
 \
Unison is a file synchronization tool for Unix and Windows. It allows \
two replicas of a collection of files and directories to be stored on \
different hosts (or different disks on the same host), modified \
separately, then brought up to date by propagating the changes in each \
replica to the other."
LICENSE = "GPL-3.0-or-later"

PV = "2.54.0"

RPM_NAME = "unison-text-2.54.0-1.1.aarch64.rpm"
RPM_HASH = "1fb124df46f5eeda030316dbdf2b4ddaaeb4807ecec8fdb1ce8e1e2c1c2dd2eaa4526d770b1e04d29d44dfb502e2bc79e17fdb6ecc97894a67d74783d69ebd84"

RPROVIDES:${PN} += "unison-text"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm
