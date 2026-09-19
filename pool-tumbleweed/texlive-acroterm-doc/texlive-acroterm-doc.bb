SUMMARY = "Documentation for texlive-acroterm"
DESCRIPTION = "This package includes the documentation for texlive-acroterm"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn61719"

RPM_NAME = "texlive-acroterm-doc-2026.226.0.0.1svn61719-61.2.noarch.rpm"
RPM_HASH = "a671b77e4b8e321230b06a56a1e145e7091991fa3a470bff3d3f64ef289ef5de66e37c7bb6741faa99368cffe75a8e9b4179f1b1806d91db0b0b80f81b54d5da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-acroterm-doc"

RDEPENDS:${PN} += ""

inherit rpm
