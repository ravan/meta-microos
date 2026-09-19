SUMMARY = "Documentation for texlive-babel-latin"
DESCRIPTION = "This package includes the documentation for texlive-babel-latin"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.3svn76176"

RPM_NAME = "texlive-babel-latin-doc-2026.226.4.3svn76176-60.2.noarch.rpm"
RPM_HASH = "53eb0093f47601b7a0b4f2099ea3c8a5e38f8f483fdf7296752179422739a494de0f94b61fd1aeef93ccd294efe4dc151a89083dfb64f57576600496ed35e46c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-latin-doc"

RDEPENDS:${PN} += ""

inherit rpm
