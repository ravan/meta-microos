SUMMARY = "Documentation for texlive-pageslts"
DESCRIPTION = "This package includes the documentation for texlive-pageslts"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0gsvn76054"

RPM_NAME = "texlive-pageslts-doc-2026.226.2.0gsvn76054-58.2.noarch.rpm"
RPM_HASH = "21ff853e1a53dfb942a9cc72b7e5f89e40dad2ec0f65c71ac16892c8e1ef135d526bcb786e01136fb7416d738070a0a9ca245bf579550bc9a2efca52bdead5c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pageslts-doc"

RDEPENDS:${PN} += ""

inherit rpm
