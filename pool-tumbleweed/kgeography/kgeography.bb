SUMMARY = "Geography Trainer"
DESCRIPTION = "KGeography is a geography learning program."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kgeography-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "466d127b49b958669371d6bfb83fe5e67ca84b1a290c9a6ee39ef22c8dfdbf1a42ed2f8930c10e0798c72df40ced43f373a48b2aefbde592c08a5a6a7e112ea8"

RPROVIDES:${PN} += "kgeography \
kgeography5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6ItemViews.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
