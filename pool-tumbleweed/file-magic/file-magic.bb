SUMMARY = "Database for libmagic to help identify files"
DESCRIPTION = "This package contains the basic magic files that libmagic reads and uses \
to estimate a file's type."
LICENSE = "BSD-2-Clause"

PV = "5.48"

RPM_NAME = "file-magic-5.48-2.2.noarch.rpm"
RPM_HASH = "f9e315b4d1f2688d2c3144ce362c6db75797519bb65d03e5c19dde96f463e66435ac01c64f86f2a43c889b93b4f23ea50485f74c0e27312cba497ca0580c47ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-file-magic \
file-magic \
libmagic-data"

RDEPENDS:${PN} += ""

inherit rpm
