SUMMARY = "Documentation for texlive-logoetalab"
DESCRIPTION = "This package includes the documentation for texlive-logoetalab"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn73069"

RPM_NAME = "texlive-logoetalab-doc-2026.226.0.0.1.1svn73069-61.2.noarch.rpm"
RPM_HASH = "2bbe8cab0befe0d12856268830884b23c25518ad72d76c179b65e76ad4b8c03eebf782eb27e37781c64327456e9fe523c636934c91cf07edf71c89936790d4ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-logoetalab-doc-fr \
texlive-logoetalab-doc"

RDEPENDS:${PN} += ""

inherit rpm
