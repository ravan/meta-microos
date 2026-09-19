SUMMARY = "Development files for dataquay, an RDF data store library"
DESCRIPTION = "Dataquay is a library that provides a C++ API for an \
RDF data store using Qt6 classes and containers. \
 \
This subpackage contains the header files for developing \
applications that want to make use of dataquay."
LICENSE = "MIT"

PV = "0.9.5"

RPM_NAME = "dataquay-devel-0.9.5-1.6.aarch64.rpm"
RPM_HASH = "c756c2d0052cb64c8b86ddcbfde815dd51df26a834c2e678eb072b32a43b736ad181e6e7af518c4042d3d0ca5c414924b4485311f25702c1b88dcdcf09f92dfd"

RPROVIDES:${PN} += "dataquay-devel \
pkgconfig-dataquay"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdataquay0"

inherit rpm
