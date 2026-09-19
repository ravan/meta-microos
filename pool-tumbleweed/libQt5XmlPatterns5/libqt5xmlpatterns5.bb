SUMMARY = "Qt 5 XmlPatterns Library"
DESCRIPTION = "The Qt XML Patterns module provides support for XPath, XQuery, XSLT, \
and XML Schema validation."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.19+kde0"

RPM_NAME = "libQt5XmlPatterns5-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "98175aa08fbaeca5c57db6f61065163d7f6a77e908b3783fa2da2fb0b280a929d474f0c20994522a68b2692154311947410fcc7623492950d73844d8171c4d6d"

RPROVIDES:${PN} += "libQt5XmlPatterns.so.5 \
libQt5XmlPatterns5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Network.so.5 \
libQt5Network5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
