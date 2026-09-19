SUMMARY = "Configuration dialog for desktop notifications"
DESCRIPTION = "KNotifyConfig provides a configuration dialog for desktop notifications which \
can be embedded in your application."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5NotifyConfig5-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "0a4677b6dc2361e1d73ffad9a5aed1b7295ad3416fd90e7628b8a7321b2d94d40ee423d1f7bd186f425ad57a1c23297a433ada793bbbd710fa3520e4605b6c77"

RPROVIDES:${PN} += "libKF5NotifyConfig.so.5 \
libKF5NotifyConfig5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5I18n.so.5 \
libKF5KIOWidgets.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcanberra.so.0 \
libstdc++.so.6"

inherit rpm
