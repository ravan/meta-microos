SUMMARY = "Documentation for texlive-statmath"
DESCRIPTION = "This package includes the documentation for texlive-statmath"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn46925"

RPM_NAME = "texlive-statmath-doc-2026.226.0.0.1svn46925-64.2.noarch.rpm"
RPM_HASH = "8bedb0ebefd1d76f0937661092250599d8fd2908127fba313a4feed219151288b57470410e5a34ea236a2ce16ca8ae11a871bb1aa0ee559637397172d00d3425"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-statmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
