SUMMARY = "Documentation for texlive-flagderiv"
DESCRIPTION = "This package includes the documentation for texlive-flagderiv"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.10svn15878"

RPM_NAME = "texlive-flagderiv-doc-2026.226.0.0.10svn15878-59.2.noarch.rpm"
RPM_HASH = "28e1d15b10d27069ad7a16c805101ce3566515741d949d4b94e0e33b84f0e6bdd09d06e37f2c4c29e22482fa8e76aa1529fe1b3b298167daf89f0581c1ab56ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flagderiv-doc"

RDEPENDS:${PN} += ""

inherit rpm
