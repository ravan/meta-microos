SUMMARY = "Development headers for Boost.IOStreans library"
DESCRIPTION = "Boost.IOStreams provides a framework for defining streams, stream \
buffers and IO filters"
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_iostreams1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "f14eb112b33c0e73d61a44cf62c8075cd473a62b222b852939f12815420e76af82f1c81c1a806a12650bda89292675eb3da66657727b1ffc165f58beabf90c1c"

RPROVIDES:${PN} += "libboost-iostreams-devel-impl \
libboost-iostreams1-91-0-devel"

RDEPENDS:${PN} += "libboost-headers1-91-0-devel \
libboost-iostreams1-91-0 \
libboost-random1-91-0-devel \
libboost-regex1-91-0-devel \
pkgconfig-bzip2 \
pkgconfig-liblzma \
pkgconfig-libzstd \
pkgconfig-zlib"

inherit rpm
