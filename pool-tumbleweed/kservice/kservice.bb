SUMMARY = "Plugin framework for desktop services"
DESCRIPTION = "Provides a plugin framework for handling desktop services. Services can \
be applications or libraries. They can be bound to MIME types or handled by \
application specific code."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kservice-5.116.0-1.9.aarch64.rpm"
RPM_HASH = "925ba256782ff63ebd83ed0e03c7471ff24664662bca76749f42b8dcb1a1bca6aa5ac4b98e2a04e181fe46755ff73a7c06f6351812130473d4aaa485811f5238"

RPROVIDES:${PN} += "kservice \
libKF5Service.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
