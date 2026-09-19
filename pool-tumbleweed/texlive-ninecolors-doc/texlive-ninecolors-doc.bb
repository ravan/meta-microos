SUMMARY = "Documentation for texlive-ninecolors"
DESCRIPTION = "This package includes the documentation for texlive-ninecolors"
LICENSE = "LPPL-1.0"

PV = "2026.226.2022dsvn76924"

RPM_NAME = "texlive-ninecolors-doc-2026.226.2022dsvn76924-61.2.noarch.rpm"
RPM_HASH = "bdd21978250d02f47eb12abdc421f07c0c6c8f57e0de07ae1fb251b3605dcacabbf9c1bd2e0d44222c37f6a3727158b1aaf72282aa7b55e892943aa193593159"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ninecolors-doc"

RDEPENDS:${PN} += ""

inherit rpm
