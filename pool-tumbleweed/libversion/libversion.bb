SUMMARY = "Version string comparison library"
DESCRIPTION = "Libversion is an advanced version string comparison library. It can \
compare versions of software packages, including complex cases like \
1.2-x.3~alpha4. Is is used by the Repology project."
LICENSE = "MIT"

PV = "3.0.4"

RPM_NAME = "libversion-3.0.4-1.4.aarch64.rpm"
RPM_HASH = "4ef9755a66c37eaaf6104d9ef3dc7242ec63d6deaf9b62ce87b84d03c1f053f37724a9a002be4546bf485146f65aa8fd1975bbfa7ac9cf3bdc46bdb5457d2790"

RPROVIDES:${PN} += "libversion"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libversion.so.1"

inherit rpm
