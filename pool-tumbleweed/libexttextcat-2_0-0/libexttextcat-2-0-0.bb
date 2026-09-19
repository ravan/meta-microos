SUMMARY = "Text categorization library"
DESCRIPTION = "The libexttextcat is a library implementing N-gram-based text categorization"
LICENSE = "BSD-4-Clause"

PV = "3.4.7"

RPM_NAME = "libexttextcat-2_0-0-3.4.7-2.9.aarch64.rpm"
RPM_HASH = "e1f032fa3025988371969f894aad0dd3f9924653a681feadb2acd6c824a0cea333b12a74c0867d167cbccd65e61a47903443cd2d7781d7e002e648eae00036ca"

RPROVIDES:${PN} += "libexttextcat-2-0-0 \
libexttextcat-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexttextcat"

inherit rpm
