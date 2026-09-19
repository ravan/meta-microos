SUMMARY = "Network transparent access to files and data"
DESCRIPTION = "This framework implements almost all the file management functions you \
will ever need. In fact, the KDE file manager (Dolphin) and the KDE \
file dialog also uses this to provide its network-enabled file management. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kio-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "90ae99ef09b28dde497e46a4d4e88a2fe4b54b039a28528c99a3b3139983cd0d949665887dbafe50e950c02d87ad53a49c5b7292aef941f48b80aa848e30a468"

RPROVIDES:${PN} += "cmake-KF6KIO \
kf6-kio-devel"

RDEPENDS:${PN} += "cmake-KF6Bookmarks \
cmake-KF6Completion \
cmake-KF6Config \
cmake-KF6CoreAddons \
cmake-KF6ItemViews \
cmake-KF6JobWidgets \
cmake-KF6Service \
cmake-KF6Solid \
cmake-KF6WindowSystem \
cmake-KF6XmlGui \
cmake-Qt6Concurrent \
cmake-Qt6DBus \
cmake-Qt6Network \
libKF6KIO6"

inherit rpm
