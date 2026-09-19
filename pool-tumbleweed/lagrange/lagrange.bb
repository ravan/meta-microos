SUMMARY = "Desktop GUI client for browsing Geminispace"
DESCRIPTION = "Lagrange is a desktop GUI client for browsing Geminispace. It offers modern \
conveniences familiar from web browsers, such as smooth scrolling, inline image \
viewing, multiple tabs, visual themes, Unicode fonts, bookmarks, history, and \
page outlines."
LICENSE = "BSD-2-Clause"

PV = "1.21.1"

RPM_NAME = "lagrange-1.21.1-1.1.aarch64.rpm"
RPM_HASH = "4b9e4bf233dd4dcf758ef98347fc192bb1573d21232ed1246bf29176606428ee57feba947f52764e9dab84aef79a7bbd6133ca390656ed5ceae37f8798ec82f3"

RPROVIDES:${PN} += "lagrange"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libX11.so.6 \
libc.so.6 \
libcrypto.so.3 \
libfribidi.so.0 \
libharfbuzz.so.0 \
libm.so.6 \
libmpg123.so.0 \
libpcre2-8.so.0 \
libssl.so.3 \
libunistring.so.5 \
libwebpdecoder.so.3 \
libz.so.1"

inherit rpm
