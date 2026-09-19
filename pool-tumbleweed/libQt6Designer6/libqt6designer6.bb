SUMMARY = "Qt 6 Designer library"
DESCRIPTION = "This package contains the Qt 6 Designer Library."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "libQt6Designer6-6.11.2-2.3.aarch64.rpm"
RPM_HASH = "0159d6c0fcb245dc20bb9ab3b3b3149069b44a6709d29fb42187b76a2f38fc8acfcf60aded4ae33c836dc55b3321ffa23538e9864f704353b20d7bf905a186e8"

RPROVIDES:${PN} += "libQt6Designer.so.6 \
libQt6Designer6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libzstd.so.1"

inherit rpm
