SUMMARY = "Documentation for texlive-bhcexam"
DESCRIPTION = "This package includes the documentation for texlive-bhcexam"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8svn72638"

RPM_NAME = "texlive-bhcexam-doc-2026.226.1.8svn72638-61.2.noarch.rpm"
RPM_HASH = "d5bd984cce80e1e198dbdc642c285585d19d4848ba5d817003c13e249697fbf7bc63380baa5ac911827621f19b08d528fd888fbf78626a7bba086f0efc6b0700"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bhcexam-doc-zh \
texlive-bhcexam-doc"

RDEPENDS:${PN} += ""

inherit rpm
