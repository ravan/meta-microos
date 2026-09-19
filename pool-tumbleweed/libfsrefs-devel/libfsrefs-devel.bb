SUMMARY = "Development files for libfsrefs"
DESCRIPTION = "libfsrefs is a library to access the Resilient File System (ReFS). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfsrefs."
LICENSE = "LGPL-3.0-or-later"

PV = "20210422"

RPM_NAME = "libfsrefs-devel-20210422-3.31.aarch64.rpm"
RPM_HASH = "3a91cfe2c5ee53cf5fb096fdfa9529a38e6a59c1cbf0069587d9f6afcbe808af24e2ccf1659e3d9ae214c5f5500e617d5ca564f7fe12b08796e8154b95e240d1"

RPROVIDES:${PN} += "libfsrefs-devel \
pkgconfig-libfsrefs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsrefs1"

inherit rpm
