SUMMARY = "Documentation for texlive-lyluatex"
DESCRIPTION = "This package includes the documentation for texlive-lyluatex"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.5svn66880"

RPM_NAME = "texlive-lyluatex-doc-2026.226.1.1.5svn66880-59.2.noarch.rpm"
RPM_HASH = "3b9ecd97e7dbb9fa874b61da3398bab2eb546f5afb0cb31ff5d9ad6b349a944d1b0abfb1d8a5a0fec6211b0d65ac5c7f35c44d453dbfdef775bd417c90f291f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lyluatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
