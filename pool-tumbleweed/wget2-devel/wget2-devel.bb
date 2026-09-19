SUMMARY = "Development files for libwget"
DESCRIPTION = "libwget which provides an interface to many useful functions used by \
Wget2. \
 \
This subpackage contains the header files for application wanting \
to build against libwget."
LICENSE = "LGPL-3.0-or-later"

PV = "2.2.1"

RPM_NAME = "wget2-devel-2.2.1-1.5.aarch64.rpm"
RPM_HASH = "910613ee94aec96a2b2ebe46c3d6ec8c508de13cce1631b70111c9c12d6db3ce344fe170f494a6f4e5840ae1ac76b14bbd6a9a5b3a42ea08a226f13946fb7bef"

RPROVIDES:${PN} += "libwget-devel \
pkgconfig-libwget \
wget2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwget4"

inherit rpm
