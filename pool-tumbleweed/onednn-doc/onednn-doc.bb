SUMMARY = "Reference documentation for the Intel Math Kernel Library"
DESCRIPTION = "The reference documentation for the Intel Math Kernel Library can be installed \
with this package."
LICENSE = "Apache-2.0"

PV = "3.7.3"

RPM_NAME = "onednn-doc-3.7.3-2.1.noarch.rpm"
RPM_HASH = "a8cf9678fc7e46ef39a22ef7de058b0d18568a2b7249bfaa5332686688e2c3a2be22c736c21a909420db1aa3019d4c29479e16af956686c01b787ca76ab0c435"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "onednn-doc"

RDEPENDS:${PN} += ""

inherit rpm
