SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "knewstuff-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "18a30b43c9ea965b18dcba2d8e67716907ee9ef143eafad50a7111787cb2d01c075ffbbd570b2b5b406c83b33cab5814a3bc2de2109a7432eecdf2244debc85f"

RPROVIDES:${PN} += "knewstuff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5I18n.so.5 \
libKF5NewStuffCore.so.5 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
