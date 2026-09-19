SUMMARY = "PostgreSQL extension for version string comparison"
DESCRIPTION = "PostgreSQL extension with support for version string comparison through libversion."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "postgresql16-libversion-2.0.1-4.3.aarch64.rpm"
RPM_HASH = "3434e58f954f3c4a851f2a8585b32cdb2b5788f02f62d705c653aa967095ed577926491d687563b84c026695f150d5096b5cea7b091d4f35ebc781a6d68e4711"

RPROVIDES:${PN} += "postgresql16-libversion"

RDEPENDS:${PN} += "libversion.so.1"

inherit rpm
