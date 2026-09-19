SUMMARY = "Qt 6 DesignerComponents library"
DESCRIPTION = "The Qt 6 DesignerComponents library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "libQt6DesignerComponents6-6.11.2-2.3.aarch64.rpm"
RPM_HASH = "e1d79d1a7e5b6c452f86101bd40e1292a731f1b6b851dad744ad60f1f83078272940d6162f20c33e5b8710e7cfd0ad2a0d839aeb9db78e43a076c56f7ff7c12d"

RPROVIDES:${PN} += "libQt6DesignerComponents.so.6 \
libQt6DesignerComponents6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Designer.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
