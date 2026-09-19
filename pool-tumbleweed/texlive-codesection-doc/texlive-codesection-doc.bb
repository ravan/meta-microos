SUMMARY = "Documentation for texlive-codesection"
DESCRIPTION = "This package includes the documentation for texlive-codesection"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn34481"

RPM_NAME = "texlive-codesection-doc-2026.226.0.0.1svn34481-60.2.noarch.rpm"
RPM_HASH = "af010013fcc0943b881f152ddcdb4ea00c9d4b089bf1d317fb4399ef583d8f36d408733e5df71712c1702203ff68f2a245a6680b9fe3770afe1a9089a61fb08c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-codesection-doc"

RDEPENDS:${PN} += ""

inherit rpm
