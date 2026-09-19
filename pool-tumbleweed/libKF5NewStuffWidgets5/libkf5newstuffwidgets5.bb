SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5NewStuffWidgets5-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "81b57178d38ac37d664a8a90c1c174b37bb73a23ef0cea5802ec7f643e5ac99d34c4ad431b540bf753928fce3ecfdafdf96674856ce97d27a157e9a417d8ebba"

RPROVIDES:${PN} += "libKF5NewStuffWidgets.so.5 \
libKF5NewStuffWidgets5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5I18n.so.5 \
libKF5NewStuff.so.5 \
libKF5NewStuffCore.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
