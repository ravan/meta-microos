SUMMARY = "Documentation for texlive-makelabels"
DESCRIPTION = "This package includes the documentation for texlive-makelabels"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn60255"

RPM_NAME = "texlive-makelabels-doc-2026.226.1.0svn60255-59.2.noarch.rpm"
RPM_HASH = "eb8f9ec33ae6aa65f372894ddad908eec0fd85192718c01fb005e3d74a511901ea12f6e6d7718c32749bef722e5d350339350060e795111b64a3b7b980fb79a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makelabels-doc"

RDEPENDS:${PN} += ""

inherit rpm
