SUMMARY = "Additional Documentation for the Advanced Media Framework (AMF) SDK"
DESCRIPTION = "This package contains additional documentation provided for the \
Advanced Media Framework (AMF) SDK."
LICENSE = "MIT"

PV = "1.5.2"

RPM_NAME = "AMF-docs-1.5.2-1.2.noarch.rpm"
RPM_HASH = "21670092205dfbd60e2f5ee7ee63cfaca6c1ed6ed9609d6c63b54881c060ba06be1fd4f317aaa0a8095ab5d625a63894e5bd637a3cbce6e88d1caf731e6bfa23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "AMF-docs"

RDEPENDS:${PN} += ""

inherit rpm
