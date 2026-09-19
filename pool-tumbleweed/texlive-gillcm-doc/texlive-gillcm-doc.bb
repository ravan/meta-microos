SUMMARY = "Documentation for texlive-gillcm"
DESCRIPTION = "This package includes the documentation for texlive-gillcm"
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.1svn19878"

RPM_NAME = "texlive-gillcm-doc-2026.226.1.1svn19878-60.2.noarch.rpm"
RPM_HASH = "4d1dd7706b6d4b8288039400e77a58d9fc0517447f990b5748005787de349415a291b79a1b1da7af186bd4d1c0642e1cc88bdaeff51a61a6fc9bf06884f574c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gillcm-doc"

RDEPENDS:${PN} += ""

inherit rpm
