SUMMARY = "Development files for libluksde"
DESCRIPTION = "libluksde is a library to access the New Technology File System (NTFS). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libluksde."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260902"

RPM_NAME = "libluksde-devel-20260902-1.2.aarch64.rpm"
RPM_HASH = "44f74d12a4cb13898361361f94699bf826068065d6da98646cd4de9d146ddfd60e81fb3710d2310b9e2074e825441d4793668ed39880a8b29854f82949859d4b"

RPROVIDES:${PN} += "libluksde-devel \
pkgconfig-libluksde"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libluksde1"

inherit rpm
