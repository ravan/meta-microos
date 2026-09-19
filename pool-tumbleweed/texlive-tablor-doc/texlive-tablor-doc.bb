SUMMARY = "Documentation for texlive-tablor"
DESCRIPTION = "This package includes the documentation for texlive-tablor"
LICENSE = "LPPL-1.0"

PV = "2026.227.4.07_gsvn31855"

RPM_NAME = "texlive-tablor-doc-2026.227.4.07_gsvn31855-62.2.noarch.rpm"
RPM_HASH = "ef2fc39c9ea5fdfed492613a37dce64a5b78867399a2534f66f746e8d8fc8a0d0d047b4634802d8ad4342333cc8426b3d92af4519cd07da2e37a0b85cd234fea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tablor-doc-en;fr \
texlive-tablor-doc"

RDEPENDS:${PN} += ""

inherit rpm
