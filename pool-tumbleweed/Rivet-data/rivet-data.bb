SUMMARY = "Data files for Rivet"
DESCRIPTION = "The Rivet project (Robust Independent Validation of Experiment and \
Theory) is a toolkit for validation of Monte Carlo event generators. \
 \
This package provides common data files for Rivet used by both C++ \
and Python bindings."
LICENSE = "Apache-2.0 & GPL-2.0-only & MPL-2.0 & LPPL-1.3a & BSL-1.0"

PV = "4.1.2"

RPM_NAME = "Rivet-data-4.1.2-2.1.noarch.rpm"
RPM_HASH = "16bbfc9d09e0e00da9939b20db6350a9aaef593a7e04e7b12beda4983444891bc97fe68a300af1d755fa6ea930a520d0b26726f1569eb488997d740f1829c03b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Rivet-data"

RDEPENDS:${PN} += ""

inherit rpm
