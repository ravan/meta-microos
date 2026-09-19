SUMMARY = "Development files for libnk2"
DESCRIPTION = "libnk2 is a library to access Outlook's Nickfile (NK2) format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libnk2."
LICENSE = "LGPL-3.0-or-later"

PV = "20260526"

RPM_NAME = "libnk2-devel-20260526-1.12.aarch64.rpm"
RPM_HASH = "c61aa22da27c846039c5b79614e4598c2810f02a50c0754d718dd24a3a4c11176d87c5ae25e2d653d2552bfab3950079a6c5aab84cac3376a11790aace3e7da8"

RPROVIDES:${PN} += "libnk2-devel \
pkgconfig-libnk2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libnk2-1"

inherit rpm
