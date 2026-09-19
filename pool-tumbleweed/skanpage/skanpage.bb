SUMMARY = "Multi-Page Scanning Application"
DESCRIPTION = "Skanpage is a simple scanning application designed for \
multi-page scanning and saving of documents and images. \
 \
Features: \
- Scanning from flatbed and ADF scanners \
- Configurable options for scanning device \
- Reordering, rotation and deletion of scanned pages \
- Saving to multi-page PDF documents and image files"
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "skanpage-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "774f7113b9c818f92ddf691a853e2a74a9144707802d9bb1c8205cac6f8965680c26720749c66e943d1da37050fc1948280795ecdb0ebfd25ec502deb1481fdd"

RPROVIDES:${PN} += "skanpage"

RDEPENDS:${PN} += "kf6-kirigami-imports \
kquickimageeditor6-imports \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6KIOCore.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libKSaneCore6.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Pdf.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libleptonica.so.6 \
libstdc++.so.6 \
libtesseract.so.5 \
qt6-declarative-imports"

inherit rpm
