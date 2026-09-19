SUMMARY = "Documentation for texlive-amsaddr"
DESCRIPTION = "This package includes the documentation for texlive-amsaddr"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-amsaddr-doc-2026.226.1.3svn77682-61.2.noarch.rpm"
RPM_HASH = "a23fed0988674bf079dadbcaecd5269bbe6cfc6a966479ee962c90124acb5c28367e207c3e2b6612d02bf2ea9162cac1f365ca79453a908864928669afb17fc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amsaddr-doc"

RDEPENDS:${PN} += ""

inherit rpm
