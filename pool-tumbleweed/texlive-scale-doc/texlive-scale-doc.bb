SUMMARY = "Documentation for texlive-scale"
DESCRIPTION = "This package includes the documentation for texlive-scale"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1.2svn15878"

RPM_NAME = "texlive-scale-doc-2026.226.1.1.2svn15878-60.2.noarch.rpm"
RPM_HASH = "2837d3179a3a67d68cf2639efef9566c4a7190bbfa886dff0d10620d7411974ee64a36195482c5a4814e69f75cfddc8f09ee6f698f3c0c018305fbf1575fce1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scale-doc"

RDEPENDS:${PN} += ""

inherit rpm
