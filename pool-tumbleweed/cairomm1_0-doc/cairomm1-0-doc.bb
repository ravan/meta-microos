SUMMARY = "Documentation for the Cairo C++ interface"
DESCRIPTION = "This package provides documentation for the Cairo C++ interface."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.6"

RPM_NAME = "cairomm1_0-doc-1.14.6-1.1.noarch.rpm"
RPM_HASH = "d236b1b2f7bb25092ef31f6e6a1603f946518f0a8cf68f69dc48eea9f99f59821462e434959dd5730bb963bdd8e9bc6a0d74d887c1b65b8b20d22cca0aa8dbf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cairomm1-0-doc"

RDEPENDS:${PN} += ""

inherit rpm
