SUMMARY = "KDE I/O Slave for cameras"
DESCRIPTION = "This package contains a KIO slave to access digital cameras."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kio_kamera-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "43b8cfcd26c78502178f924fe71c9d9261f37439a457f2cfe378d63985faaed311c1d691bc715f15a4afdf7e41b473921bea9a14b1ba8b39f3bbb5dd827c644d"

RPROVIDES:${PN} += "kio-kamera"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KIOCore.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgphoto2-port.so.12 \
libgphoto2.so.6 \
libstdc++.so.6"

inherit rpm
