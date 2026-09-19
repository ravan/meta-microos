SUMMARY = "Documentation for texlive-easybook"
DESCRIPTION = "This package includes the documentation for texlive-easybook"
LICENSE = "LPPL-1.0"

PV = "2026.226.2025aesvn76924"

RPM_NAME = "texlive-easybook-doc-2026.226.2025aesvn76924-61.4.noarch.rpm"
RPM_HASH = "416dd68ac3dfb70186e25af874673e65c2b002239ef1d4ac110ea4875044493ac260f13cfd492e9a48123c5005d454c4703778bda9ab4543d9a093f8e58e9cd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-easybook-doc-zh \
texlive-easybook-doc"

RDEPENDS:${PN} += ""

inherit rpm
