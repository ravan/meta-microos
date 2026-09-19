SUMMARY = "Documentation for texlive-underlin"
DESCRIPTION = "This package includes the documentation for texlive-underlin"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn15878"

RPM_NAME = "texlive-underlin-doc-2026.226.1.01svn15878-60.2.noarch.rpm"
RPM_HASH = "5cc48a9ad791cc5ee7684d353f90a9dcd87cd6d06cccd74e0dcda644d20749df725cb6302a3ba265db794387102aa9f8c7953173fe4fbd3f2be17fd09514f458"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-underlin-doc"

RDEPENDS:${PN} += ""

inherit rpm
