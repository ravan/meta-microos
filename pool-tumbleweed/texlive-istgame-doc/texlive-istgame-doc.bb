SUMMARY = "Documentation for texlive-istgame"
DESCRIPTION = "This package includes the documentation for texlive-istgame"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn76924"

RPM_NAME = "texlive-istgame-doc-2026.226.2.1svn76924-63.2.noarch.rpm"
RPM_HASH = "c961dbb782dded3f9c40c839fe19b0d12eff01d93a0b42029d117088d7b4fe87c7e2e7c346acf79e6c51bf7a642c19c5c32bf0be030ec9692d529015f0680c84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-istgame-doc"

RDEPENDS:${PN} += ""

inherit rpm
