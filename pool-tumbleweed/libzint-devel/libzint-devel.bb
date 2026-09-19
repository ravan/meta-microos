SUMMARY = "Development files for Zint"
DESCRIPTION = "C library and header files needed to develop applications that use \
the Zint library. The API documentation can be found on the project website: \
http://www.zint.org.uk/zintSite/Manual.aspx"
LICENSE = "GPL-3.0-or-later"

PV = "2.16.0"

RPM_NAME = "libzint-devel-2.16.0-2.1.aarch64.rpm"
RPM_HASH = "ad9008596172bd9660e515d28aec131f50a3c29f4ef8a5c8d1159a1ba81a370e516aab76057597481433abe11be80602731e9e2782296a64db3cfbabde570631"

RPROVIDES:${PN} += "cmake-zint \
libzint-devel"

RDEPENDS:${PN} += "libzint2-16 \
pkgconfig-libpng"

inherit rpm
