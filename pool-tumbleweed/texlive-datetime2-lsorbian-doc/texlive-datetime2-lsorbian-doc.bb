SUMMARY = "Documentation for texlive-datetime2-lsorbian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-lsorbian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn47749"

RPM_NAME = "texlive-datetime2-lsorbian-doc-2026.226.1.1svn47749-59.2.noarch.rpm"
RPM_HASH = "330126621fe27211ce5601998dda8705ff687a853889cae48692d76327afc4101ebd62c6707edec50377a608ad9e88fee6cc885567669828f7a12e713c66b054"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-lsorbian-doc"

RDEPENDS:${PN} += ""

inherit rpm
