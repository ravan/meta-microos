SUMMARY = "Binary libraries for subunit"
DESCRIPTION = "Binary libraries for subunit"
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.6"

RPM_NAME = "libsubunit0-1.4.6-1.2.aarch64.rpm"
RPM_HASH = "07c01ed9f819d38b5f73119f7c3e0982c0962a52d5ddd1712f5d06a76db3e607bfe0025dfe82b80ad6a99caf80bd4ec4bb5aeb7fbc94054fcb285747bd4a6c3b"

RPROVIDES:${PN} += "libsubunit.so.0 \
libsubunit0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
subunit"

inherit rpm
