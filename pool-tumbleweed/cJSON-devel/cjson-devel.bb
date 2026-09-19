SUMMARY = "Development files for the cJSON library"
DESCRIPTION = "A simple JSON parser library written in ANSI C. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcjson."
LICENSE = "MIT"

PV = "1.7.19"

RPM_NAME = "cJSON-devel-1.7.19-3.2.aarch64.rpm"
RPM_HASH = "6c04583db9eee808c5b5af10224d561a103861e925fd006b5e88597eb36c811a6cbe2e9fa38f397e2cf41a437ddaf0e72a49218ce4bf8c77ee6e3d206187d9b7"

RPROVIDES:${PN} += "cJSON-devel \
cmake-cJSON \
pkgconfig-libcjson"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcjson1"

inherit rpm
