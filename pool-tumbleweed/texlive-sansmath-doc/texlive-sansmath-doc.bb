SUMMARY = "Documentation for texlive-sansmath"
DESCRIPTION = "This package includes the documentation for texlive-sansmath"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-sansmath-doc-2026.226.1.1svn77682-60.2.noarch.rpm"
RPM_HASH = "5529a7fa20f6d647c23046a4196a8feee945875fd66424d06013173e46b830ab5f93f420d54f581b2d49e1fe0258400c59415294c1658d24567655f6cd54285d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sansmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
