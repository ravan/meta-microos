SUMMARY = "Development files for s2n library"
DESCRIPTION = "s2n is a C99 implementation of the TLS/SSL protocols. \
 \
This package contains the development files."
LICENSE = "Apache-2.0"

PV = "1.7.9"

RPM_NAME = "s2n-devel-1.7.9-1.1.aarch64.rpm"
RPM_HASH = "4b77ded319c85db7597af01930931a5c8d9c1ec38a9720e5dd6083d6d2f940bfc260cf35f35b1d09624d8e7f6dad3aa431d9016dd50c1732ea3ecbb4b24ef200"

RPROVIDES:${PN} += "cmake-s2n \
s2n-devel"

RDEPENDS:${PN} += "libs2n1"

inherit rpm
