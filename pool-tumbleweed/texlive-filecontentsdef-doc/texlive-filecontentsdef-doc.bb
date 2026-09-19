SUMMARY = "Documentation for texlive-filecontentsdef"
DESCRIPTION = "This package includes the documentation for texlive-filecontentsdef"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn77682"

RPM_NAME = "texlive-filecontentsdef-doc-2026.226.1.5svn77682-59.2.noarch.rpm"
RPM_HASH = "d711606ab8a3a9d8e58b11e47e6f62024e2bd3bafc5c375333841dc11650601bcdc17f1dea92512a75671049511f22c621006062ec1a2e15c636a4a7ffdec07d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-filecontentsdef-doc"

RDEPENDS:${PN} += ""

inherit rpm
