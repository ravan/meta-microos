SUMMARY = "Documentation for texlive-datetime2-estonian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-estonian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn47565"

RPM_NAME = "texlive-datetime2-estonian-doc-2026.226.1.1svn47565-59.2.noarch.rpm"
RPM_HASH = "8158ab60f6c1197e6252f0f958fc9355f07448c02416c7f4208472b41e1045506ae9562a1a79f34b927c118435b78c951172364ae13a74638635a5cca3f40a05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-estonian-doc"

RDEPENDS:${PN} += ""

inherit rpm
