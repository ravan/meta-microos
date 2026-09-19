SUMMARY = "The 'exiv2' libextractor plugin"
DESCRIPTION = "This package ships the 'exiv2' plugin for libextractor."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.14"

RPM_NAME = "libextractor-plugins-exiv2-1.14-1.2.aarch64.rpm"
RPM_HASH = "14c49558e7aed47fe41067fa2a058609d8084a84cb720d0e03ff67ff69d1dc6312507f20257b9bcb8c7318894bc3196153926ae57390a76a4f32318c64b78aa5"

RPROVIDES:${PN} += "libextractor-exiv2.so \
libextractor-plugins-exiv2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexiv2.so.28 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
