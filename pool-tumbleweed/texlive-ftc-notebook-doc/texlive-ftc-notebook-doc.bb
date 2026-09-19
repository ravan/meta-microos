SUMMARY = "Documentation for texlive-ftc-notebook"
DESCRIPTION = "This package includes the documentation for texlive-ftc-notebook"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn50043"

RPM_NAME = "texlive-ftc-notebook-doc-2026.226.1.1svn50043-60.2.noarch.rpm"
RPM_HASH = "22f5843c4c789bcafd9723a26491982f6d1308eaa65f0f69bd0ff5a4a47084685bb2eff518be82dd49213d23cf1de0cd4707fa649fa45b134df73262c53eb6b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ftc-notebook-doc"

RDEPENDS:${PN} += ""

inherit rpm
