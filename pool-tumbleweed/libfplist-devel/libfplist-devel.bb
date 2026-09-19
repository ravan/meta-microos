SUMMARY = "Development files for libfplist"
DESCRIPTION = "libfplist is a library for Apple plist formats. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfplist."
LICENSE = "LGPL-3.0-or-later"

PV = "20260521"

RPM_NAME = "libfplist-devel-20260521-1.4.aarch64.rpm"
RPM_HASH = "e045c126276cd2cd004838234df5d775416d232de6827d9cdad266f60be46993d95ea45798771851daaeb25d02238a93e9cd375ce232ebd92418789020e49a4a"

RPROVIDES:${PN} += "libfplist-devel \
pkgconfig-libfplist"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfplist1"

inherit rpm
