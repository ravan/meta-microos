SUMMARY = "Files and utilities used by daemons"
DESCRIPTION = "Miscellaneous files and utilities used by other libvirt daemons"
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-daemon-common-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "2d67673969e5c08191a988a3391502892e5a21865ce40627e76c1eff3e0b6eee06c4ba577920a3a2403fd3ccb1eadafed21abccea84e4b6ae9f276e76d9dca15"

RPROVIDES:${PN} += "config-libvirt-daemon-common \
libvirt-admin \
libvirt-daemon-common"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
bash-completion \
dbus-service \
dmidecode \
gettext-runtime \
group-libvirt \
iproute \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libreadline.so.8 \
libvirt-admin.so.0 \
libvirt-libs \
libvirt.so.0 \
libxml2.so.16 \
logrotate \
netcat-openbsd \
pkgconfig-udev \
systemd"

inherit rpm
