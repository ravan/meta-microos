SUMMARY = "Qt 5 Xml Library"
DESCRIPTION = "The Qt XML module provides C++ implementations of the SAX and DOM \
standards for XML."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5Xml5-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "8934ec01e6055b4bb81439870710efe94fbcb5a7b202020db4b264af76a5e722b6b598d2de366704005313ec657beb763ed4ba0264ca6b521462e9a1f1d3caab"

RPROVIDES:${PN} += "libQt5Xml.so.5 \
libQt5Xml5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
