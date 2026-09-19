SUMMARY = "Documentation for texlive-gelasio"
DESCRIPTION = "This package includes the documentation for texlive-gelasio"
LICENSE = "OFL-1.1"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-gelasio-doc-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "b1886f9c1b40f838f1d1867056fbde9a1b794d0af90e392aaa918a2904aa8181f73a748343ade0e5cbc8597cc60fc5c7b309366808edf22509abe5656d1c4bbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gelasio-doc"

RDEPENDS:${PN} += ""

inherit rpm
