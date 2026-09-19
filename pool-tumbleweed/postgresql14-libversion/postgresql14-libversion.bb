SUMMARY = "PostgreSQL extension for version string comparison"
DESCRIPTION = "PostgreSQL extension with support for version string comparison through libversion."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "postgresql14-libversion-2.0.1-4.3.aarch64.rpm"
RPM_HASH = "d04a116dbbcf32ca7870d99467a2114e1a38fe9b119d11d619a515efd2accd7138973160c0097e50a960a52d1fa1e7d8348f14138ae7cd46b61d0bdca0b5fc75"

RPROVIDES:${PN} += "postgresql14-libversion"

RDEPENDS:${PN} += "libversion.so.1"

inherit rpm
