SUMMARY = "Documentation for texlive-beameraudience"
DESCRIPTION = "This package includes the documentation for texlive-beameraudience"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn23427"

RPM_NAME = "texlive-beameraudience-doc-2026.226.0.0.1svn23427-61.2.noarch.rpm"
RPM_HASH = "9f4edaf885d8797b94a00aaa02055cbabbb2f4e5671e50f39997eda031f43a0d17db50f3dfffb08422e621f2612d22cf11c6365ee0f5617e09637d82cd98d7ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beameraudience-doc"

RDEPENDS:${PN} += ""

inherit rpm
