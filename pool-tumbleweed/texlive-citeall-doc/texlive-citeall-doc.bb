SUMMARY = "Documentation for texlive-citeall"
DESCRIPTION = "This package includes the documentation for texlive-citeall"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77682"

RPM_NAME = "texlive-citeall-doc-2026.226.1.4svn77682-60.2.noarch.rpm"
RPM_HASH = "d78618160cf74ff88b25098b51baed2209cb49e7156df9795f996f93b6f9732447af7af1fc53b1ddaaf359eef0036ba6af93ffcc34871f52386d63c2f26c3265"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-citeall-doc"

RDEPENDS:${PN} += ""

inherit rpm
