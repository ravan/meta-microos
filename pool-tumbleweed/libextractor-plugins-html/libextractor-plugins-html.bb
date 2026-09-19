SUMMARY = "The 'html' libextractor plugin"
DESCRIPTION = "This package ships the 'html' plugin for libextractor."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.14"

RPM_NAME = "libextractor-plugins-html-1.14-1.2.aarch64.rpm"
RPM_HASH = "811bc27d8b2949681def8122d9a331fd4937e0701b4e44e7d942aed540652b0e564a044aac8ad2090386e31add9cba2884505030d3d1670a13dd5d686ba7a2cc"

RPROVIDES:${PN} += "libextractor-html.so \
libextractor-plugins-html"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmagic.so.1 \
libtidy.so.58"

inherit rpm
