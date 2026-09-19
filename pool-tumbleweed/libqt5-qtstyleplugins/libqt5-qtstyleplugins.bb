SUMMARY = "Qt 5 Style Plugins"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains additional style plugins."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "5.0.0+git20170311"

RPM_NAME = "libqt5-qtstyleplugins-5.0.0+git20170311-10.34.aarch64.rpm"
RPM_HASH = "4e1ba2b9d8878a212a882a95412e9e7c62a9b7f63f76e58ab11204b110e5db7ec5fad40a04b7d5d9581e7145c93db7305907f2f428a815cc2cd2f07c37cd2252"

RPROVIDES:${PN} += "libbb10styleplugin.so \
libqcleanlooksstyle.so \
libqmotifstyle.so \
libqplastiquestyle.so \
libqt5-qtstyleplugins"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
