SUMMARY = "Development Files for libburn"
DESCRIPTION = "Development files for developing applications using libisoburn."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.8"

RPM_NAME = "libisoburn-devel-1.5.8-1.2.aarch64.rpm"
RPM_HASH = "6495bd704128c5122e8644434e040c0896cd5248f7d9736f303963be0cb8735d591b16ee2534444c61f016a4a9ae0c2971fe912129268123e63ff4416db9ade1"

RPROVIDES:${PN} += "libburnia-devel \
libisoburn-devel \
pkgconfig-libisoburn-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libburn-devel \
libisoburn1 \
libisofs-devel"

inherit rpm
