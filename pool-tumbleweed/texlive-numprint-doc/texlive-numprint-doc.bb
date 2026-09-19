SUMMARY = "Documentation for texlive-numprint"
DESCRIPTION = "This package includes the documentation for texlive-numprint"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.39svn77682"

RPM_NAME = "texlive-numprint-doc-2026.226.1.39svn77682-61.2.noarch.rpm"
RPM_HASH = "842a5c7e1cdad0a90af077c35a8db54a01e2f9c45b81022469deca23bb1ac828759252ff2f2e32cba9346902e75d25f48a03d982606e41fd237a0ef2bba729ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numprint-doc"

RDEPENDS:${PN} += ""

inherit rpm
