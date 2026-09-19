SUMMARY = "Development files for libmdmp"
DESCRIPTION = "libmdmp is a library to access the Windows Minidump (MDMP) format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libmdmp."
LICENSE = "LGPL-3.0-or-later"

PV = "20210420"

RPM_NAME = "libmdmp-devel-20210420-3.29.aarch64.rpm"
RPM_HASH = "eaf003a5534aa0020510a8a4cc2838f975d8d4a2c834f361bb39ba648e68484cc3f7c1fac6ee6664a02a27c4376148ea6284a9187489bcef6ae296ed337b268b"

RPROVIDES:${PN} += "libmdmp-devel \
pkgconfig-libmdmp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libmdmp1"

inherit rpm
