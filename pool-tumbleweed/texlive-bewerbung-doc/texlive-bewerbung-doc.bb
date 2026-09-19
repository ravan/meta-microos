SUMMARY = "Documentation for texlive-bewerbung"
DESCRIPTION = "This package includes the documentation for texlive-bewerbung"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn61632"

RPM_NAME = "texlive-bewerbung-doc-2026.226.1.3svn61632-61.2.noarch.rpm"
RPM_HASH = "6c95512326bc5bbe3d9da88823a06e1cc9c1dc749bb6a1f388f31a700a8cf2492cb99f7e093abfd45abe1f6b236a27b61800085fb2114f87d11a7b3e4803ecb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "en) \
locale(texlive-bewerbung-doc-de;de \
texlive-bewerbung-doc"

RDEPENDS:${PN} += ""

inherit rpm
