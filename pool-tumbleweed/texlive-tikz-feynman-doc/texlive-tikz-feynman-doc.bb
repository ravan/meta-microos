SUMMARY = "Documentation for texlive-tikz-feynman"
DESCRIPTION = "This package includes the documentation for texlive-tikz-feynman"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn56615"

RPM_NAME = "texlive-tikz-feynman-doc-2026.226.1.1.0svn56615-59.2.noarch.rpm"
RPM_HASH = "09a17809205574ef8f5a22710327cec64ef247f280850d5527010b81273207c5c5a00c8a0b1f3fa2e73f3566250fdd5142f8388de6696a97126b91910b0c36cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-feynman-doc"

RDEPENDS:${PN} += ""

inherit rpm
