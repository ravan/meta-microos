SUMMARY = "TeXshop-like TeX Editor"
DESCRIPTION = "The TeXworks project is a simple TeX front-end program (working \
environment) that is modeled on Dick Koch's TeXShop for Mac OS X."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.11"

RPM_NAME = "texworks-0.6.11-1.3.aarch64.rpm"
RPM_HASH = "398d73a0d6c7175e40c3b735f0f244f3a0a9b4b763b7c2a6c77b31880c80689b0b01d42e308983546d714f3494dcdbc4e65a9c7e921fea079995dd734b0daed7"

RPROVIDES:${PN} += "texworks"

RDEPENDS:${PN} += "dbus-1 \
hunspell \
ld-linux-aarch64.so.1 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6UiTools.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libm.so.6 \
libpoppler-qt6.so.3 \
libstdc++.so.6 \
libz.so.1 \
poppler-tools \
texlive-latex"

inherit rpm
