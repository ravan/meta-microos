SUMMARY = "Documentation for texlive-crimsonpro"
DESCRIPTION = "This package includes the documentation for texlive-crimsonpro"
LICENSE = "OFL-1.1"

PV = "2026.226.svn64565"

RPM_NAME = "texlive-crimsonpro-doc-2026.226.svn64565-61.2.noarch.rpm"
RPM_HASH = "25870d176cf640bb0ec84722b32ced187e368752b0baa66c3b4e129df8e15b074daedd1557eb7d93dc6e273007418ceadfc7846451647f7b79e9c0d5ea15f80e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crimsonpro-doc"

RDEPENDS:${PN} += ""

inherit rpm
