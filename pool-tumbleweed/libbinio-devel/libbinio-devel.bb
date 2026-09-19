SUMMARY = "Development files for libbinio"
DESCRIPTION = "The binary I/O stream class library presents a platform-independent way to \
access binary data streams in C++. It transparently converts between \
machine-internal binary data representation and can be used on arbitrary \
binary data sources. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libbinio."
LICENSE = "LGPL-2.1-only"

PV = "1.5"

RPM_NAME = "libbinio-devel-1.5-1.14.aarch64.rpm"
RPM_HASH = "9095ab87ac1c3242eb67efcec82153aeb66e92ba183dbc1b699295f8093b7544b5369fc96a17fc745149d1c1b8c4a0adc6234cda5d4acc08ececf9539fc2f547"

RPROVIDES:${PN} += "libbinio-devel \
pkgconfig-libbinio"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbinio1"

inherit rpm
