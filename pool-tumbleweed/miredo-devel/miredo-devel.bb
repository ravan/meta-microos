SUMMARY = "Header files, libraries and development documentation for miredo"
DESCRIPTION = "This package contains the header files, development libraries and development \
documentation for miredo. If you would like to develop programs using miredo, \
you will need to install miredo-devel."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.6"

RPM_NAME = "miredo-devel-1.2.6-5.19.aarch64.rpm"
RPM_HASH = "8e2306af7181e1ae5d69c2d34ffc47c8e6881a7cc8767e7bc83e1add0e030c1ee1e1c21aa3241e88f1e1cf094bc831a41bdf924bfe9a1c756e0c496f67df1ac7"

RPROVIDES:${PN} += "miredo-devel"

RDEPENDS:${PN} += "miredo-common"

inherit rpm
