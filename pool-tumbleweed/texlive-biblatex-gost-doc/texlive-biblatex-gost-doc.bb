SUMMARY = "Documentation for texlive-biblatex-gost"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-gost"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.24svn66935"

RPM_NAME = "texlive-biblatex-gost-doc-2026.226.1.24svn66935-61.2.noarch.rpm"
RPM_HASH = "c518f11f58907b4fd8e5901460d6baa0be93ae09640eebc40e74362c928997d9acf0141ba352d87fb653d9523aaeb4de12f02e4eda2e9fe78639e57a17e6f79d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-biblatex-gost-doc-en \
ru) \
texlive-biblatex-gost-doc"

RDEPENDS:${PN} += ""

inherit rpm
