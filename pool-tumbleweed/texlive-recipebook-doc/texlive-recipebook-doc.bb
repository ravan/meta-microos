SUMMARY = "Documentation for texlive-recipebook"
DESCRIPTION = "This package includes the documentation for texlive-recipebook"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn75878"

RPM_NAME = "texlive-recipebook-doc-2026.226.svn75878-60.4.noarch.rpm"
RPM_HASH = "2a9a0e85424706b0810685dd933fe487519e6d7f80b30fede15c6f923deab4777024f541d83137f1cb77b568278e38b76a072f92dc6dbf4236edbe8bc67c597e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-recipebook-doc"

RDEPENDS:${PN} += ""

inherit rpm
