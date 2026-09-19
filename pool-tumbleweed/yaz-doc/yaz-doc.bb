SUMMARY = "Documentation for yaz (Z39.50 Library)"
DESCRIPTION = "YAZ is a C library for developing client and server applications \
using the ANSI/NISO Z39.50 protocol for Information Retrieval. \
 \
This package contains the documentation."
LICENSE = "BSD-3-Clause"

PV = "5.38.0"

RPM_NAME = "yaz-doc-5.38.0-1.1.noarch.rpm"
RPM_HASH = "604ddd85c38dab22953aa637418db733e7e85adeaf85f1eec35f614ee628450b0b4fa8caf306fe012a98a9fb65486c285aa5b459ce6c5352d27804cf21b8b7fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yaz-doc"

RDEPENDS:${PN} += ""

inherit rpm
