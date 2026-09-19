SUMMARY = "Documentation for texlive-nevelok"
DESCRIPTION = "This package includes the documentation for texlive-nevelok"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.03svn39029"

RPM_NAME = "texlive-nevelok-doc-2026.226.1.03svn39029-61.2.noarch.rpm"
RPM_HASH = "29aa704025677a6b125b3a97c2c27d75f7d7896a3b1b70e4f73e184af82567541d1ec110b6541cf0020d01f50912f0fad3cc821065d488420211a01f5a865eba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nevelok-doc"

RDEPENDS:${PN} += ""

inherit rpm
