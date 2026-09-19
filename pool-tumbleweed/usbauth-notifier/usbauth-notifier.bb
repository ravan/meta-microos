SUMMARY = "Notifier for USB Firewall to use with desktop environments"
DESCRIPTION = "A notifier for the usbauth firewall against BadUSB attacks. The user could manually allow or deny USB devices."
LICENSE = "GPL-2.0-only"

PV = "1.0.4"

RPM_NAME = "usbauth-notifier-1.0.4-2.10.aarch64.rpm"
RPM_HASH = "6550b21ddeed4d846f6bb2ae023ec46b389381d448903402743282a56f65e2984c9774330b66b61a1abf3351b90f93c15e63c7d34323187098a8ec218a2ac538"

RPROVIDES:${PN} += "group-usbauth \
group-usbauth-notifier \
usbauth-notifier"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnotify.so.4 \
libudev.so.1 \
libusbauth-configparser.so.1 \
permissions \
usbauth"

inherit rpm
