SUMMARY = "Documentation for texlive-unigrazpub"
DESCRIPTION = "This package includes the documentation for texlive-unigrazpub"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.00svn76924"

RPM_NAME = "texlive-unigrazpub-doc-2026.226.1.00svn76924-60.2.noarch.rpm"
RPM_HASH = "fddaeb305c5f2ec01dc30c6d6f20bea754aaa08f0709e6518664f064310f720247c392f793e0977faf137a5301ee1d3b418193a0f5503bf3cd385df0a024f8ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unigrazpub-doc"

RDEPENDS:${PN} += ""

inherit rpm
