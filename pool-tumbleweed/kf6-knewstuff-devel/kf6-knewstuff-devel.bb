SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-knewstuff-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "83d8259ccefd53d0d558f42491e38d854a2bad7cad9ccee1b59b8dc9d601586b72b9f2e3af7006a88e72491679660ee3e1106d99e6bb18cc898b117a31d24ce8"

RPROVIDES:${PN} += "cmake-KF6NewStuff \
cmake-KF6NewStuffCore \
kf6-knewstuff-core-devel \
kf6-knewstuff-devel"

RDEPENDS:${PN} += "cmake-KF6Attica \
cmake-KF6CoreAddons \
cmake-Qt6Widgets \
ld-linux-aarch64.so.1 \
libKF6NewStuffCore6 \
libKF6NewStuffWidgets.so.6 \
libKF6NewStuffWidgets6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
