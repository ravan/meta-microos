SUMMARY = "Documentation for texlive-fetchcls"
DESCRIPTION = "This package includes the documentation for texlive-fetchcls"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn45245"

RPM_NAME = "texlive-fetchcls-doc-2026.226.1.0svn45245-59.2.noarch.rpm"
RPM_HASH = "5caff9e6d7cd1d392f35c962e31f678fd4dbeb388cb580359c248a6d70c1b3a71666b2cc4425d2aba1ee129f6ebe2b21a858dc9f27bffda67d8f2d29d3eaa5c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fetchcls-doc"

RDEPENDS:${PN} += ""

inherit rpm
