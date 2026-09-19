SUMMARY = "Documentation for texlive-unitconv"
DESCRIPTION = "This package includes the documentation for texlive-unitconv"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn76924"

RPM_NAME = "texlive-unitconv-doc-2026.226.0.0.01svn76924-60.2.noarch.rpm"
RPM_HASH = "70b3ce7282b86080a1cc594f5c3d9d7c1865f8a30a527302e760993950399e198eee6b548d66f4b4a56c6a88f951d0f9853c0212124ed2091b6169cbc5b065bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unitconv-doc"

RDEPENDS:${PN} += ""

inherit rpm
