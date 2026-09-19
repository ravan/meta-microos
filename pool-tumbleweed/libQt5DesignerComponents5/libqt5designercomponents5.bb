SUMMARY = "Qt 5 Designer Components Library"
DESCRIPTION = "The Qt 5 Designer Components library."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.19+kde3"

RPM_NAME = "libQt5DesignerComponents5-5.15.19+kde3-1.8.aarch64.rpm"
RPM_HASH = "4d8c0a6f9b291ae13b5518990521f207718971fd1fa90804c81a34d274f9e7801dce69be3054fdba4ebb0ae3790c942b8b9f374d16c2c4ba4c47576323660364"

RPROVIDES:${PN} += "libQt5DesignerComponents.so.5 \
libQt5DesignerComponents5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Designer.so.5 \
libQt5Designer5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
