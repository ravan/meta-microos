SUMMARY = "PostgreSQL extension for version string comparison"
DESCRIPTION = "PostgreSQL extension with support for version string comparison through libversion."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "postgresql18-libversion-2.0.1-4.3.aarch64.rpm"
RPM_HASH = "18a9675491d037cb708505f76d2002cb0b36d557b12f4fd34e2056777b42df50373eae8dcc022db0861146dd03656ef9830f2d7bae841ac008ab20eb3ae282c3"

RPROVIDES:${PN} += "postgresql18-libversion"

RDEPENDS:${PN} += "libversion.so.1"

inherit rpm
