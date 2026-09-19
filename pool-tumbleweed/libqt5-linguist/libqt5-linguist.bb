SUMMARY = "Qt 5 Linguist Tools"
DESCRIPTION = "The Qt 5 Linguist Tools."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.19+kde3"

RPM_NAME = "libqt5-linguist-5.15.19+kde3-1.8.aarch64.rpm"
RPM_HASH = "4384f16c60cfb811344ae165a12220bf760d8e17bb4f7f4f55bbb43caf10caa1e3880709f3580f7c9e064e8f8b0a9d5881e405e6a15ce030d1ea293947b1f3c4"

RPROVIDES:${PN} += "libqt5-linguist"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5PrintSupport5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libQt5Xml5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
