SUMMARY = "Accessibilty tools helper library, used e.g. by screen readers"
DESCRIPTION = "This library is used when writing accessibility clients such as screen readers."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "libqaccessibilityclient-qt5-0-0.6.0-1.9.aarch64.rpm"
RPM_HASH = "d8d031a2685fb73715681d0f1266cb7f60d300c9269581eaf10f8b72993d197d5a009d7cc4e410ecf09ef575c77f0742a6870801f1873c3a700412c8800ed8d3"

RPROVIDES:${PN} += "libqaccessibilityclient-qt5-0 \
libqaccessibilityclient-qt5.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
at-spi2-core \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libqaccessibilityclient-qt5 \
libstdc++.so.6"

inherit rpm
