SUMMARY = "Documentation for texlive-unfonts-core"
DESCRIPTION = "This package includes the documentation for texlive-unfonts-core"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn56291"

RPM_NAME = "texlive-unfonts-core-doc-2026.226.svn56291-60.2.noarch.rpm"
RPM_HASH = "e32c81862cef9b3b43364cd38ae3696c5610271c73cf1accd9c52fb2a98d50dfee5409080e4b83eeae544c77898775ec2b7b1fc5b5d24d1425f38686c0ee94aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unfonts-core-doc"

RDEPENDS:${PN} += ""

inherit rpm
