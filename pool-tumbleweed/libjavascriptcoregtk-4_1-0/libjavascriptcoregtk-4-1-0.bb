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

RPM_NAME = "libjavascriptcoregtk-4_1-0-2.52.6-1.2.aarch64.rpm"
RPM_HASH = "99d908a406a6bd8be598f2c38b0a0e9cacaea71a3be37387011669e5d77902af769d188a15c5e782f5d41d23d32ffcc33555b1691a820c6f30f616c1c738d554"

RPROVIDES:${PN} += "libjavascriptcoregtk-4-1-0 \
libjavascriptcoregtk-4.1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
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
