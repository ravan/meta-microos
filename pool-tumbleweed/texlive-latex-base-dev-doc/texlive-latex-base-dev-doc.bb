SUMMARY = "Documentation for texlive-latex-base-dev"
DESCRIPTION = "This package includes the documentation for texlive-latex-base-dev"
LICENSE = "LPPL-1.0"

PV = "2026.226.pre_release_1svn77483"

RPM_NAME = "texlive-latex-base-dev-doc-2026.226.pre_release_1svn77483-63.2.noarch.rpm"
RPM_HASH = "dba0efa09df739501014416d84719b3dde1d238f7a61e38efcc3347f3df7f47e706dd668b13748630ceec1de09febcc3418c482ec70d6f488d1674b97b387e83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-base-dev-doc"

RDEPENDS:${PN} += ""

inherit rpm
