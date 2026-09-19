SUMMARY = "Documentation for texlive-findhyph"
DESCRIPTION = "This package includes the documentation for texlive-findhyph"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.4svn47444"

RPM_NAME = "texlive-findhyph-doc-2026.226.3.4svn47444-59.2.noarch.rpm"
RPM_HASH = "d3bd4b0c431b698a693944860123a70a295276691410cbfa150c0dcc9203de609fc1dd3b21b45dd1b0ec66898f8d5006b0f4c469f990730468eed5e515398393"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-findhyph.1 \
texlive-findhyph-doc"

RDEPENDS:${PN} += ""

inherit rpm
