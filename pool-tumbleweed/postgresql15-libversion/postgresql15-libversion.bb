SUMMARY = "PostgreSQL extension for version string comparison"
DESCRIPTION = "PostgreSQL extension with support for version string comparison through libversion."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "postgresql15-libversion-2.0.1-4.3.aarch64.rpm"
RPM_HASH = "f40b6e808fd64f1a2cd5585efe090a307172466a4c57eb32b6ef77e37d8442211b62fe717248d8a80dffcc2a7763cc597f91e018493f20b8faa6fea4d7b3ac1f"

RPROVIDES:${PN} += "postgresql15-libversion"

RDEPENDS:${PN} += "libversion.so.1"

inherit rpm
