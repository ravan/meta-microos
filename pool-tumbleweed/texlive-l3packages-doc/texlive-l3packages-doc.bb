SUMMARY = "Documentation for texlive-l3packages"
DESCRIPTION = "This package includes the documentation for texlive-l3packages"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76637"

RPM_NAME = "texlive-l3packages-doc-2026.226.svn76637-63.2.noarch.rpm"
RPM_HASH = "a6fcd4b1b7cc685074941e99599a81e82a36575b94d0d58889890fb12eb9c76b5d034045a5206005bc30cffc86885bf7849e026a99d88d8b400c1608ecfae5ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l3packages-doc"

RDEPENDS:${PN} += ""

inherit rpm
