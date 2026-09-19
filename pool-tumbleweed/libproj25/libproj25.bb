SUMMARY = "Cartographic projection software"
DESCRIPTION = "This package the library for performing respective \
forward and inverse transformation of cartographic data to or from cartesian \
data with a wide range of selectable projection functions."
LICENSE = "MIT"

PV = "9.8.1"

RPM_NAME = "libproj25-9.8.1-2.3.aarch64.rpm"
RPM_HASH = "ce989a8c57ede0bc468cb3fde75726f6f8ec576894093a8b1cf4d33c4bd0241aa3f90f404963b06eac4c421712f4aec7043411a25b8f3ae6654930b39ec34799"

RPROVIDES:${PN} += "libproj.so.25 \
libproj25"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
