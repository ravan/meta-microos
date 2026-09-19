SUMMARY = "Documentation for texlive-hanging"
DESCRIPTION = "This package includes the documentation for texlive-hanging"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2bsvn77682"

RPM_NAME = "texlive-hanging-doc-2026.226.1.2bsvn77682-60.4.noarch.rpm"
RPM_HASH = "c27d7f08874fee1ee3c702480833e3304af6b5ec001e4a5e0d40eb3f28c9e6832125b889c42633ac31be6504d017b7aa8c562a22aa46fdcb90290000ddcfcca7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hanging-doc"

RDEPENDS:${PN} += ""

inherit rpm
