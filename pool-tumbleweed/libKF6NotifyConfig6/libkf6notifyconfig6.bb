SUMMARY = "Configuration dialog for desktop notifications"
DESCRIPTION = "KNotifyConfig provides a configuration dialog for desktop notifications which \
can be embedded in your application."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6NotifyConfig6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "93c7715a1d018859dd3a57070cff1e2ba2836b99273acb78af1059c114dd3a7b537af3ec4be353dd5d5790ff42e038de413e47b5335a2b1719ada1c7c1d17949"

RPROVIDES:${PN} += "libKF6NotifyConfig.so.6 \
libKF6NotifyConfig6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-knotifyconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6I18n.so.6 \
libKF6KIOWidgets.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcanberra.so.0 \
libstdc++.so.6"

inherit rpm
