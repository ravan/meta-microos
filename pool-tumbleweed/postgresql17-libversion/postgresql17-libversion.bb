SUMMARY = "PostgreSQL extension for version string comparison"
DESCRIPTION = "PostgreSQL extension with support for version string comparison through libversion."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "postgresql17-libversion-2.0.1-4.3.aarch64.rpm"
RPM_HASH = "ea2446937b801b5cc639a4a79285afd2d95fbaef74d1a9c9710c5ed87e84155cdfda587dc53a8b61b6d4bbf36d30033b1843710f37f8357488412535f78e312f"

RPROVIDES:${PN} += "postgresql17-libversion"

RDEPENDS:${PN} += "libversion.so.1"

inherit rpm
