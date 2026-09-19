SUMMARY = "Documentation how to Use eom"
DESCRIPTION = "This package contains the documentation for eom"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.28.1"

RPM_NAME = "eom-doc-1.28.1-1.3.noarch.rpm"
RPM_HASH = "cf76a1f6ebcde2f4a9bb629ebb0cc76525a2427a93ef2a6d51202f27ec3121c88fee0162febcb9f58bd056ae01f16f7739c16e37ab1efa8c7820b60c8f2efb10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eom-doc"

RDEPENDS:${PN} += ""

inherit rpm
