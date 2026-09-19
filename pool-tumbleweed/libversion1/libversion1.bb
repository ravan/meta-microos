SUMMARY = "Version string comparison library"
DESCRIPTION = "Libversion is an advanced version string comparison library. It can \
compare versions of software packages, including complex cases like \
1.2-x.3~alpha4. Is is used by the Repology project."
LICENSE = "MIT"

PV = "3.0.4"

RPM_NAME = "libversion1-3.0.4-1.4.aarch64.rpm"
RPM_HASH = "56293468e0ffe7c50988126019e0cb26c8ea3c23b4c96f66aa6e682c72425a8ab3a1e0542dc042708cbba225d80c86420b33fb03846d6c0bccae8ceaf763c29c"

RPROVIDES:${PN} += "libversion.so.1 \
libversion1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
