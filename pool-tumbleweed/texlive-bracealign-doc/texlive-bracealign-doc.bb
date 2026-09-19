SUMMARY = "Documentation for texlive-bracealign"
DESCRIPTION = "This package includes the documentation for texlive-bracealign"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-bracealign-doc-2026.226.1.0svn77682-59.2.noarch.rpm"
RPM_HASH = "dba7f3630e75f4ff96f83ef59f03b57ecd645e1a1b0292660966f039c5f9dc6b25bc64a58ff0e81fab67a1a91485e644e5da99edfb903b65433afeed15c35663"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bracealign-doc"

RDEPENDS:${PN} += ""

inherit rpm
