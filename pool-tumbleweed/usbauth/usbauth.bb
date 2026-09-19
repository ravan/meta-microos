SUMMARY = "USB firewall against BadUSB attacks"
DESCRIPTION = "It is a firewall against BadUSB attacks. \
A config file describes in which way devices would be accepted."
LICENSE = "GPL-2.0-only"

PV = "1.0.5"

RPM_NAME = "usbauth-1.0.5-1.13.aarch64.rpm"
RPM_HASH = "d75c5004a287869b8577d0abd0488c297327534b2fe25e1927daeecabfecbc6a757937479d2ccc8f71e9ef7fe66fb8e803b57c7d13bc70ca84b798a49d41618e"

RPROVIDES:${PN} += "config-usbauth \
usbauth"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libudev.so.1 \
libusbauth-configparser.so.1 \
systemd \
udev"

inherit rpm
