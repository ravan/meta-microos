SUMMARY = "Libreswan VPN client plugin for NetworkManager"
DESCRIPTION = "This package contains software for integrating the libreswan VPN \
software with NetworkManager and the GNOME desktop."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.30"

RPM_NAME = "NetworkManager-libreswan-1.2.30-1.4.aarch64.rpm"
RPM_HASH = "6b2aef129988d4fa8bce1f374e69b3957e7ea1ec2e65298b78513cea34f2e7473c4d32169765b234c7bf1acbda541320396eaffec1a02a1ec1895a204fb1568d"

RPROVIDES:${PN} += "NetworkManager-libreswan \
NetworkManager-openswan \
libnm-vpn-plugin-libreswan.so"

RDEPENDS:${PN} += "/usr/sbin/ipsec \
NetworkManager \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnl-3.so.200 \
libnm.so.0"

inherit rpm
