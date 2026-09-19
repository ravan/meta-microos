SUMMARY = "Library to access image metadata"
DESCRIPTION = "libexiv2 is a C++ library with a C compatibility interface to access \
image metadata, esp from Exif tags."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "0.28.9"

RPM_NAME = "libexiv2-28-0.28.9-2.1.aarch64.rpm"
RPM_HASH = "4b29c1ce5bddfecee36e40875aad5baa8f678a3d17e94cab43d72d4231485d1fd99e2e0bc6f2c63aec1c975086ca9006c783273143d37c920162ef03254cff65"

RPROVIDES:${PN} += "libexiv2-28 \
libexiv2.so.28"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libINIReader.so.0 \
libbrotlidec.so.1 \
libc.so.6 \
libcurl.so.4 \
libexpat.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
