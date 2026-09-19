SUMMARY = "Documentation for texlive-simplebnf"
DESCRIPTION = "This package includes the documentation for texlive-simplebnf"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn76924"

RPM_NAME = "texlive-simplebnf-doc-2026.226.1.0.1svn76924-60.2.noarch.rpm"
RPM_HASH = "0a091ff318b8ae6818b9a7207156db478f4350ecd2296487a901637bd35289495b4e6bcdc0db34e3f776bec478dcd225df2a3b09ff3f140c21a1cbb5c2b6dbf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simplebnf-doc"

RDEPENDS:${PN} += ""

inherit rpm
