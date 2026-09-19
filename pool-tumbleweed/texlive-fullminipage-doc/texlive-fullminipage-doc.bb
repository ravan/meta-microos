SUMMARY = "Documentation for texlive-fullminipage"
DESCRIPTION = "This package includes the documentation for texlive-fullminipage"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.1.1svn34545"

RPM_NAME = "texlive-fullminipage-doc-2026.226.0.0.1.1svn34545-60.2.noarch.rpm"
RPM_HASH = "c060838bc9c1803cae795d7bf5119f4eabb74f3be6b0e385a768a948f8b0175419dd98c57fbf3e2b29f0ded42445830facda5e518ad661171e86234c832d1309"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fullminipage-doc"

RDEPENDS:${PN} += ""

inherit rpm
