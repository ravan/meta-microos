SUMMARY = "Documentation for the C/C++ Algorithmic Differentiation Library"
DESCRIPTION = "This package provides the user's manual for ADOL-C."
LICENSE = "EPL-1.0 | GPL-2.0-or-later"

PV = "2.7.2"

RPM_NAME = "adolc-doc-2.7.2-5.5.noarch.rpm"
RPM_HASH = "6e614e2798d5650a8be9da722acf928a4ff9c7f997d3d01ed4879aab966988e61bce55ef0e18456d34361476dc771e0ad7dca17a67f8b5d3e97fc47cf8a3658a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adolc-doc"

RDEPENDS:${PN} += ""

inherit rpm
