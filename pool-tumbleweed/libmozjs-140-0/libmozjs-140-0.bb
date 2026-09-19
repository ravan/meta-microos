SUMMARY = "JavaScript's library"
DESCRIPTION = "JavaScript is the Netscape-developed object scripting language used in millions \
of web pages and server applications worldwide. Netscape's JavaScript is a \
superset of the ECMA-262 Edition 3 (ECMAScript) standard scripting language, \
with only mild differences from the published standard. \
 \
This package contains the JavaScript's library."
LICENSE = "MPL-2.0"

PV = "140.15.0"

RPM_NAME = "libmozjs-140-0-140.15.0-1.1.aarch64.rpm"
RPM_HASH = "5d330abd19b60d3366a5092b67f6fd1adcfbac75b6a75ab7d8b38abd09f85629d9a1b2b49488f59df0b29342c2dc80dd38a1276272c03044421e4a2e30999797"

RPROVIDES:${PN} += "libmozjs-140-0 \
libmozjs-140.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.78 \
libicuuc.so.78 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
