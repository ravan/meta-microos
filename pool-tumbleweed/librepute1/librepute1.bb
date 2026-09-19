SUMMARY = "Library for performing REPUTE queries for spammy domains"
DESCRIPTION = "This package provides the shared library librepute which \
performs REPUTE queries for spammy domains."
LICENSE = "BSD-3-Clause"

PV = "2.11.0"

RPM_NAME = "librepute1-2.11.0-13.5.aarch64.rpm"
RPM_HASH = "b94f27486a9bd380ced59e38721836f361fea13b86e75461831fb09799d8e63802f78252efdad39879026182cf4c5fdd89c6caf169ebbf1f17327dd2ec94b24e"

RPROVIDES:${PN} += "librepute.so.1 \
librepute1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libjansson.so.4 \
libut.so.1"

inherit rpm
