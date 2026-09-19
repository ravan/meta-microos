SUMMARY = "Documentation for texlive-dpcircling"
DESCRIPTION = "This package includes the documentation for texlive-dpcircling"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn54994"

RPM_NAME = "texlive-dpcircling-doc-2026.226.1.0svn54994-59.2.noarch.rpm"
RPM_HASH = "4ab130b44ff820143f07b1ea079828666f2b8947717a6e7eb4ae78d020efe7f947c4e910c2bfcd96181615b3879c534b53a9ccf314ebb017f2b1c60786740682"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dpcircling-doc"

RDEPENDS:${PN} += ""

inherit rpm
