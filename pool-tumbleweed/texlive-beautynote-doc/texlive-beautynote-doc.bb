SUMMARY = "Documentation for texlive-beautynote"
DESCRIPTION = "This package includes the documentation for texlive-beautynote"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-beautynote-doc-2026.226.svn76924-61.2.noarch.rpm"
RPM_HASH = "ed91e5928ddf8aebaaf83c06b54444da22c4984d2899758c200cd9cc081caa3b545349d49d574a380a0fe46a4aeeb667d012dbc665f820b18ab5d505d04b37bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beautynote-doc"

RDEPENDS:${PN} += ""

inherit rpm
