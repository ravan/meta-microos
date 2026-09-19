SUMMARY = "Documentation for texlive-mlist"
DESCRIPTION = "This package includes the documentation for texlive-mlist"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6asvn77682"

RPM_NAME = "texlive-mlist-doc-2026.226.0.0.6asvn77682-61.2.noarch.rpm"
RPM_HASH = "1e3046637c6b8a526c78ddca0ab8e1fd7c6db6121bbc6936b7f89dad69074292f5e70161ee789311e1ceb8cc446e886b40873ae6f0897e0d7e032142d0754efd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mlist-doc"

RDEPENDS:${PN} += ""

inherit rpm
