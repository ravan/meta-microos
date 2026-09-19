SUMMARY = "Documentation for texlive-debate"
DESCRIPTION = "This package includes the documentation for texlive-debate"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.1svn64846"

RPM_NAME = "texlive-debate-doc-2026.226.0.0.2.1svn64846-59.2.noarch.rpm"
RPM_HASH = "1737cc9fa12162c8e90079f52fb051f7f024ef477803d51844687f89cd94b1a28b7cdcea0a589ce9026ba9e4032cfe50d24009b5d7d3a317395dd54b4ba11c0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-debate-doc"

RDEPENDS:${PN} += ""

inherit rpm
