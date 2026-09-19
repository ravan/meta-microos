SUMMARY = "Documentation for texlive-euclideangeometry"
DESCRIPTION = "This package includes the documentation for texlive-euclideangeometry"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.2svn67608"

RPM_NAME = "texlive-euclideangeometry-doc-2026.226.0.0.2.2svn67608-59.2.noarch.rpm"
RPM_HASH = "184654778e61687874b9de740bc57af4a787b345da2c98067332a51ebcb8bbaf8307830c4149aa3ff974cf66d206ab5a94330ea63754cc00c76af07034f78947"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-euclideangeometry-doc"

RDEPENDS:${PN} += ""

inherit rpm
