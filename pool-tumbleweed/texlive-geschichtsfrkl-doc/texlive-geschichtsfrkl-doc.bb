SUMMARY = "Documentation for texlive-geschichtsfrkl"
DESCRIPTION = "This package includes the documentation for texlive-geschichtsfrkl"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn42121"

RPM_NAME = "texlive-geschichtsfrkl-doc-2026.226.1.4svn42121-60.2.noarch.rpm"
RPM_HASH = "750cae62edaf991abedc5f876c4befdaef33a9646663a39c4c04bfe5a98a9df30a44638356a201f25e60e18748adfdd8d974daf2bfb789b1c8091b6f9b47a7c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-geschichtsfrkl-doc-de \
texlive-geschichtsfrkl-doc"

RDEPENDS:${PN} += ""

inherit rpm
