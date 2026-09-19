SUMMARY = "Documentation for texlive-pgfmolbio"
DESCRIPTION = "This package includes the documentation for texlive-pgfmolbio"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.21asvn71551"

RPM_NAME = "texlive-pgfmolbio-doc-2026.226.0.0.21asvn71551-58.2.noarch.rpm"
RPM_HASH = "d474c55e1c6d1beea3addad5b5faa2cea54cbba7f030dbb4082950db09889fe8764d770deb88f8165baca74289fb1c039ecbbb481c61a1a5df64e06b263d19e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgfmolbio-doc"

RDEPENDS:${PN} += ""

inherit rpm
