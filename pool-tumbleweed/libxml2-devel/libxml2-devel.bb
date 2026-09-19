SUMMARY = "Development files for libxml2, an XML manipulation library"
DESCRIPTION = "The XML C library can load and save extensible data structures \
or manipulate any kind of XML files. \
 \
This subpackage contains header files for developing \
applications that want to make use of libxml."
LICENSE = "MIT"

PV = "2.15.4"

RPM_NAME = "libxml2-devel-2.15.4-1.1.aarch64.rpm"
RPM_HASH = "54b6520cdcdd7dfce03f5de166fcd12c464c6560b963aa97c9e64b09a8d8196891c32b601f3330132232238b963ebcb47b10295253e9757e45d127ff390e30c5"

RPROVIDES:${PN} += "libxml2-devel \
pkgconfig-libxml-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libxml2 \
libxml2-16 \
libxml2-tools \
pkgconfig-zlib"

inherit rpm
