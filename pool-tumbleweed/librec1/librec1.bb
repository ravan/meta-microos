SUMMARY = "Text-based databases called recfiles"
DESCRIPTION = "A set of tools and libraries to access human-editable, text-based \
databases. \
 \
The data is stored as a sequence of records, each record containing \
an arbitrary number of named fields. \
 \
Despite its simplicity, recfiles can be used to store medium-sized \
databases."
LICENSE = "GPL-3.0-or-later"

PV = "1.9"

RPM_NAME = "librec1-1.9-3.4.aarch64.rpm"
RPM_HASH = "88c6ccbe45985b4c880d102b5529822e06faaa962af572bb51f7d590d9ab84e2d62ca7f34c65395e1abd11a7873da1407249453edf72f4efd8a077b1a7272eeb"

RPROVIDES:${PN} += "librec.so.1 \
librec1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcrypt.so.20 \
libuuid.so.1"

inherit rpm
