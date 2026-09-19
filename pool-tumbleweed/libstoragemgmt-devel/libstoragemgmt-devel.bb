SUMMARY = "Development files for libstoragemgmt"
DESCRIPTION = "The libstoragemgmt-devel package contains libraries and header files for \
developing applications that use libstoragemgmt."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.10.3"

RPM_NAME = "libstoragemgmt-devel-1.10.3-1.3.aarch64.rpm"
RPM_HASH = "efea408023aa7bd146ac9c0a9d1da207a82da91c2552b56b283adf3874aa5b3c439ef1d6b48860395ccf60d3deefab0742d732f2c3d4cd1b109b25510206918b"

RPROVIDES:${PN} += "libstoragemgmt-devel \
pkgconfig-libstoragemgmt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstoragemgmt1"

inherit rpm
