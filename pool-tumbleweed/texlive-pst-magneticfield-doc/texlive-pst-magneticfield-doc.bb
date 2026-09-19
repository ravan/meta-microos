SUMMARY = "Documentation for texlive-pst-magneticfield"
DESCRIPTION = "This package includes the documentation for texlive-pst-magneticfield"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.17asvn69493"

RPM_NAME = "texlive-pst-magneticfield-doc-2026.226.1.17asvn69493-59.2.noarch.rpm"
RPM_HASH = "3b449f67d94c601c888d887476c4d6a945f0514f0c7f7a9c4d52046df540c6ae6e35a3c6b00fd31f8ae09a9c3d1a5faf69f07829bca24a25d35d947b98ab04d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-magneticfield-doc"

RDEPENDS:${PN} += ""

inherit rpm
