SUMMARY = "JavaScript Core Engine, GTK+ Port"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.52.6"

RPM_NAME = "libjavascriptcoregtk-6_0-1-2.52.6-1.2.aarch64.rpm"
RPM_HASH = "253b0e8b74885bd71f444536fb45ed9e6436cc8a0c70a1e4bce7986bf93d7ffc95df2d21b24fedadae5ad0381367bcfc56bb890e9cc2a6a8bfbf2b359aad12d5"

RPROVIDES:${PN} += "libjavascriptcoregtk-6-0-1 \
libjavascriptcoregtk-6.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbacktrace.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libicui18n.so.78 \
libicuuc.so.78 \
libm.so.6 \
libstdc++.so.6 \
libsystemd.so.0"

inherit rpm
