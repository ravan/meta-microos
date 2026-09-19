SUMMARY = "Documentation for the cmocka library"
DESCRIPTION = "Documentation for the cmocka unit testing library."
LICENSE = "Apache-2.0"

PV = "2.0.2"

RPM_NAME = "libcmocka-doc-2.0.2-1.4.noarch.rpm"
RPM_HASH = "9621f081639b667442e2a7201137d90399df4aa1229b6201e049a7dec7541f7cb7afbeaf7da592f6534d8e54d5e0db58e5f4f73a6311e532c7ccc0b4643a50cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libcmocka-devel-/usr/share/doc/packages/libcmocka-devel \
libcmocka-doc"

RDEPENDS:${PN} += ""

inherit rpm
