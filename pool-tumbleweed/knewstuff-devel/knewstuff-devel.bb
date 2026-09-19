SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "knewstuff-devel-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "58250f02224073d48d66420574d7af630a857971b189ccb6e1f5c3d2fee552bfde97c8700c53bfaae96db32d9006a1bfe6d46b32798309bd36a1268acf43ceec"

RPROVIDES:${PN} += "cmake-KF5NewStuff \
knewstuff-devel"

RDEPENDS:${PN} += "cmake-KF5NewStuffQuick \
cmake-KF5Service \
cmake-KF5XmlGui \
cmake-Qt5Widgets \
knewstuff-core-devel \
ld-linux-aarch64.so.1 \
libKF5NewStuff5 \
libKF5NewStuffCore5 \
libKF5NewStuffWidgets.so.5 \
libKF5NewStuffWidgets5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
