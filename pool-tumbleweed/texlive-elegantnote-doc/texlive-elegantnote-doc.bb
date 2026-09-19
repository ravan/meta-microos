SUMMARY = "Documentation for texlive-elegantnote"
DESCRIPTION = "This package includes the documentation for texlive-elegantnote"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.60svn78191"

RPM_NAME = "texlive-elegantnote-doc-2026.226.2.60svn78191-61.4.noarch.rpm"
RPM_HASH = "6a0c84298eb1445cc473ad705dbd971ce50d675c235ae4267dd8e38af47735d36535d6fc1ef1c7d671eaad5b7329bea80c69d269656544939e3204449537664e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-elegantnote-doc-zh \
texlive-elegantnote-doc"

RDEPENDS:${PN} += ""

inherit rpm
