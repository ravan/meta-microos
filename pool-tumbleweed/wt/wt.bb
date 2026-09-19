SUMMARY = "C++ library for developing web applications (Web Toolkit)"
DESCRIPTION = "Wt is a C++ library and application server for developing and \
deploying web applications. The widget-centric API is inspired by \
existing C++ GUI APIs. It offers complete abstraction of any \
web-specific implementation details.  Most importantly, the entire \
application is written in only one compiled language (C++), from which \
the library generates the necessary HTML, Javascript, CGI, and AJAX \
code."
LICENSE = "GPL-2.0-only"

PV = "4.12.6"

RPM_NAME = "wt-4.12.6-1.4.aarch64.rpm"
RPM_HASH = "7c570bbb05749ac467bccf37da420561ac77bf08baec68f5c1e44bfe8a0bf7a07f09f7e68af9118f81304f7f60d33c53154653ccc6ff01168e4618d8d11e8e41"

RPROVIDES:${PN} += "config-wt \
libwt.so.4.12.6 \
libwtfcgi.so.4.12.6 \
libwthttp.so.4.12.6 \
libwttest.so.4.12.6 \
wt"

RDEPENDS:${PN} += "/sbin/ldconfig \
FastCGI \
group-www \
ld-linux-aarch64.so.1 \
libGLEW.so.2.3 \
libGLX.so.0 \
libGraphicsMagick-Q16.so.3 \
libOpenGL.so.0 \
libX11.so.6 \
libboost-filesystem.so.1.91.0 \
libboost-program-options.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libcrypto.so.3 \
libfcgi++.so.0 \
libfcgi.so.0 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libhpdf.so.2.4 \
libm.so.6 \
libpango-1.0.so.0 \
libpangoft2-1.0.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1 \
openssl \
user-wwwrun"

inherit rpm
