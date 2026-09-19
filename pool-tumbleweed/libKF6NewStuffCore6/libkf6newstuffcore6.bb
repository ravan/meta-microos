SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6NewStuffCore6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "192cd686399301042c8c35a04e0771572fc7e9d69d014622b6ee921fe6c2facdf5642a0ea75083bb66b2ae96324bf5271a0866cc6594f3bb116cd6a435972fee"

RPROVIDES:${PN} += "libKF6NewStuffCore.so.6 \
libKF6NewStuffCore6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-knewstuff \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6Attica.so.6 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6Package.so.6 \
libKF6Syndication.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
