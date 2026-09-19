SUMMARY = "Documentation for texlive-gindex"
DESCRIPTION = "This package includes the documentation for texlive-gindex"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn52311"

RPM_NAME = "texlive-gindex-doc-2026.226.0.0.2svn52311-60.2.noarch.rpm"
RPM_HASH = "f75881ee1e9043f72d1acdc1da3d65496492d3383d604e0399ecd9c3048f6b4763578154789cf4bd84884ebd4b105307f595221e58dbcc0052a617e0a7a4c92f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
