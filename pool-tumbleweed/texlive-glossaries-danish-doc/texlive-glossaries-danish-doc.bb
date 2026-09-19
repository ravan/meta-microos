SUMMARY = "Documentation for texlive-glossaries-danish"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-danish"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn35665"

RPM_NAME = "texlive-glossaries-danish-doc-2026.226.1.0svn35665-60.4.noarch.rpm"
RPM_HASH = "8892d1f8fed6ad292dc697ad2818b5014f6d181f630026525a27a769c6a0b80323095c536e92065ed67b6edd44817bf68efe8857fa635543818362add3774cc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-danish-doc"

RDEPENDS:${PN} += ""

inherit rpm
