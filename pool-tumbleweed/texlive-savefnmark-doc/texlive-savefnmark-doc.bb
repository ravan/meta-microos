SUMMARY = "Documentation for texlive-savefnmark"
DESCRIPTION = "This package includes the documentation for texlive-savefnmark"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-savefnmark-doc-2026.226.1.0svn15878-60.2.noarch.rpm"
RPM_HASH = "f0c37fdb4955f1d269baf34c0250396b5329e13b7016013a71b7abb99a2c7dc7ba8ccbb2858680c12aa1b3c75600a3fe7e3c09940898da74457a80d7079ca6e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-savefnmark-doc"

RDEPENDS:${PN} += ""

inherit rpm
