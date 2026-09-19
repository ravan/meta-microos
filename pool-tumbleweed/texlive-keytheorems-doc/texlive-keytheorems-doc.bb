SUMMARY = "Documentation for texlive-keytheorems"
DESCRIPTION = "This package includes the documentation for texlive-keytheorems"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.5svn78035"

RPM_NAME = "texlive-keytheorems-doc-2026.226.0.0.3.5svn78035-63.2.noarch.rpm"
RPM_HASH = "69ef020e8e3fdfe0324c86974d8b538597ffb55294781e9664a09a5d28a0ad7a815a55d4db140e279ff391b537cf042e9a07f4e40614f6cdb346077d5b84e291"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-keytheorems-doc"

RDEPENDS:${PN} += ""

inherit rpm
