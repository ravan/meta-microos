SUMMARY = "Documentation for texlive-xargs"
DESCRIPTION = "This package includes the documentation for texlive-xargs"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-xargs-doc-2026.226.1.1svn77682-59.4.noarch.rpm"
RPM_HASH = "d9497c4572cf7cccd48c992fb867790779c2023c9692593a6dd322a95d1e0affc57103468de4c699717a218e17c04eff70a23090b3994ad0a0cdf47ce5d9e71a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xargs-doc-fr;en \
texlive-xargs-doc"

RDEPENDS:${PN} += ""

inherit rpm
