SUMMARY = "Documentation for texlive-frontespizio"
DESCRIPTION = "This package includes the documentation for texlive-frontespizio"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4asvn24054"

RPM_NAME = "texlive-frontespizio-doc-2026.226.1.4asvn24054-60.2.noarch.rpm"
RPM_HASH = "0fd81c89185303f156c5bebeb1bafd7e0a8e96613f36c94a2bcefece3a42dbaf7d5302f70bd112f063abfae5feb1121c50889a66b104644f0eb4e797c7dcdb05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-frontespizio-doc-it \
texlive-frontespizio-doc"

RDEPENDS:${PN} += ""

inherit rpm
