SUMMARY = "Development files for openvdb"
DESCRIPTION = "This package contains the C++ header files and symbolic links to the shared \
libraries for openvdb. If you would like to develop programs using openvdb, \
you will need to install openvdb-devel."
LICENSE = "Apache-2.0"

PV = "13.0.0"

RPM_NAME = "openvdb-devel-13.0.0-2.1.aarch64.rpm"
RPM_HASH = "f36ec0d56af03a0978394eeb0a6ed291e3ffbb4cd5349dffdd9eddff32ace4e8c0a9f9be3ca8fdc32f03d6cc48ffa5cdbe624e5880ddcfcc00c77691d8bf2140"

RPROVIDES:${PN} += "openvdb-devel"

RDEPENDS:${PN} += "libboost-headers-devel-impl \
libopenvdb13-0"

inherit rpm
