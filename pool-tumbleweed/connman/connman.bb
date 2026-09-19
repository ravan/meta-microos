SUMMARY = "Connection Manager"
DESCRIPTION = "Connection Manager provides a daemon for managing Internet connections \
within embedded devices running the Linux operating system."
LICENSE = "GPL-2.0-only"

PV = "1.42"

RPM_NAME = "connman-1.42-2.16.aarch64.rpm"
RPM_HASH = "444464c78470958c7659a8bad271b994987b4e14d5ae79c97068f4dcb1a6728426a0ded1e0c5b6936c825a96c7f5de15400acb64cced847944d8944ddbe3fd5b"

RPROVIDES:${PN} += "config-connman \
connman"

RDEPENDS:${PN} += "/usr/bin/sh \
bluez \
dhcp \
iptables \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libmnl.so.0 \
libnftnl.so.11 \
libresolv.so.2 \
systemd \
wpa-supplicant"

inherit rpm
