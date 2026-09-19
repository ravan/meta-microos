SUMMARY = "Qt 5 Widgets Library"
DESCRIPTION = "The Qt Widgets Module provides a set of UI elements to create classic \
desktop-style user interfaces."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5Widgets5-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "6e0cbb4adbd7c19c26f4f7bebb76e943a62bcfc9964c82fd215d7304955efe12728bb4878b49ade15ca6cc182b9de42e0b2b38ceb73f8fec576207a311ea377a"

RPROVIDES:${PN} += "libQt5Widgets.so.5 \
libQt5Widgets5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
