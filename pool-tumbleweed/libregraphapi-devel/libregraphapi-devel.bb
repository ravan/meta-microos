SUMMARY = "Development files for the libregraphAPI library"
DESCRIPTION = "Libregraphapi is a MS Graph API influenced API for cloud collaboration. \
 \
This package contains development files for libregraphapi."
LICENSE = "Apache-2.0"

PV = "1.0.4"

RPM_NAME = "libregraphapi-devel-1.0.4-3.4.aarch64.rpm"
RPM_HASH = "89cbe51df7346e318500490aee28fdba76315bf1cbbce2624a50c3be88819615486d559402d60f85cf6a7a48c37d1b684f66d2441f2b39559df11f1410958530"

RPROVIDES:${PN} += "cmake-LibreGraphAPI \
libregraphapi-devel"

RDEPENDS:${PN} += "libLibreGraphAPI1"

inherit rpm
