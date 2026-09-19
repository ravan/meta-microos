SUMMARY = "Network transparent access to files and data"
DESCRIPTION = "This framework implements almost all the file management functions you \
will ever need. In fact, the KDE file manager (Dolphin) and the KDE \
file dialog also uses this to provide its network-enabled file management. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kio-devel-5.116.0-1.11.aarch64.rpm"
RPM_HASH = "c2aaefaac7472776b44ccb031c3424d2e6810088668ce250834d6b85e5a95fbd85b745cb241ded793533e1e9d1e30aaf23a3475cf5426df88acffe7e706036ad"

RPROVIDES:${PN} += "cmake-KF5KIO \
kio-devel"

RDEPENDS:${PN} += "cmake-KF5Bookmarks \
cmake-KF5Completion \
cmake-KF5Config \
cmake-KF5CoreAddons \
cmake-KF5ItemViews \
cmake-KF5JobWidgets \
cmake-KF5Service \
cmake-KF5Solid \
cmake-KF5WindowSystem \
cmake-KF5XmlGui \
cmake-Qt5Concurrent \
cmake-Qt5DBus \
cmake-Qt5Network \
kio \
kio-core \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libQt5Core.so.5 \
libc.so.6"

inherit rpm
