SUMMARY = "CAD program for creating virtual LEGO models"
DESCRIPTION = "CAD program for creating virtual LEGO models. \
It has an intuitive interface, designed to allow \
new users to start creating new models without \
having to spend too much time learning the \
application."
LICENSE = "GPL-2.0-only"

PV = "25.09"

RPM_NAME = "leocad-25.09-1.2.aarch64.rpm"
RPM_HASH = "abc767b8374121962ea968d6cbec49daf5176605d59b41b5629292bde930e6a4f2d95b66ca00b355355a5d6050997611b4880d93f5202ecaf8c6494f7b0497f6"

RPROVIDES:${PN} += "leocad"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
povray"

inherit rpm
