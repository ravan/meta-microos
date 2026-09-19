SUMMARY = "Documentation for texlive-datetime2-galician"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-galician"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn47631"

RPM_NAME = "texlive-datetime2-galician-doc-2026.226.1.0svn47631-59.2.noarch.rpm"
RPM_HASH = "38f000b92c5207378b584e2abd3bface7335bc0c559d7218214a9f4e12f9f17d155c6219afd20aec8adb1c6e63c731f7f19132713cfa4948f7b6958484c5c772"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-galician-doc"

RDEPENDS:${PN} += ""

inherit rpm
