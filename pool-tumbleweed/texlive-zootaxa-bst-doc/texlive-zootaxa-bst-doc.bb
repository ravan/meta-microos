SUMMARY = "Documentation for texlive-zootaxa-bst"
DESCRIPTION = "This package includes the documentation for texlive-zootaxa-bst"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn76790"

RPM_NAME = "texlive-zootaxa-bst-doc-2026.226.1.0svn76790-59.4.noarch.rpm"
RPM_HASH = "526302d3fe6584a680ae90de5d1353e7d0649e6fb92974822dcbffcfc0f9fc49d5b0b4ae409a29460c204cb112e1c47741f0322eab34dafdc2c130745724d7fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zootaxa-bst-doc"

RDEPENDS:${PN} += ""

inherit rpm
