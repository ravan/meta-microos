SUMMARY = "Libvirt plugin for Name Service Switch"
DESCRIPTION = "libvirt plugin for NSS for translating domain names into IP addresses."
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-nss-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "2391b068d9105288a923faceb2eca02e7e04398ca42fd4891bb7bfeafdcdbd41507a2c205ed17d234529a6235ab8a53f6e4d43d2beb6293c0b313e5ce9f2a866"

RPROVIDES:${PN} += "libnss-libvirt-guest.so.2 \
libnss-libvirt.so.2 \
libvirt-nss"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjson-c.so.5 \
libvirt-daemon-driver-network"

inherit rpm
