SUMMARY = "Setup program for dm-crypt Based Encrypted Block Devices"
DESCRIPTION = "cryptsetup is used to conveniently set up dm-crypt based device-mapper \
targets. It allows to set up targets to read cryptoloop compatible \
volumes as well as LUKS formatted ones. The package additionally \
includes support for automatically setting up encrypted volumes at boot \
time via the config file /etc/crypttab."
LICENSE = "CC-BY-SA-4.0 & LGPL-2.0-or-later-with-cryptsetup-OpenSSL-exception"

PV = "2.8.7"

RPM_NAME = "cryptsetup-2.8.7-1.2.aarch64.rpm"
RPM_HASH = "09edbe37f4f090b053688abb1c8b1f982e569a2cdae9fbac93db3864d01574c0517d285a730276ef231172c209d2a29b8a3970a596d89a3a4c2150b36c1b75b5"

RPROVIDES:${PN} += "cryptsetup \
integritysetup \
veritysetup"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libcryptsetup.so.12 \
libpopt.so.0 \
libpwquality.so.1 \
libuuid.so.1"

inherit rpm
