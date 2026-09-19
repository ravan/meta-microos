SUMMARY = "Development files for lerc"
DESCRIPTION = "The package contains libraries and header files for lerc"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "lerc-devel-4.1.0-3.3.aarch64.rpm"
RPM_HASH = "4807e2bc38691b6f48389dd39bb26c1716a73a76c2d7fe0eb117a66f6be75a39676d9620323ba0d82c097f0378aa7612ba230f3018297e28afda36130e265632"

RPROVIDES:${PN} += "lerc-devel \
pkgconfig-Lerc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libLerc4"

inherit rpm
