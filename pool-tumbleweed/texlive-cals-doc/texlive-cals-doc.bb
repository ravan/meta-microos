SUMMARY = "Documentation for texlive-cals"
DESCRIPTION = "This package includes the documentation for texlive-cals"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4.2svn43003"

RPM_NAME = "texlive-cals-doc-2026.226.2.4.2svn43003-59.2.noarch.rpm"
RPM_HASH = "668393d90b70d198794f9406fc4d1d87f2917956b858451e0337bbb19f1a410a28c4aa59b2784adc81caf7c56cb2d9a6db540b566b09a8e04819525d23ce7773"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cals-doc"

RDEPENDS:${PN} += ""

inherit rpm
