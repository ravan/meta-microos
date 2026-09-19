SUMMARY = "Library for setting up dm-crypt Based Encrypted Block Devices"
DESCRIPTION = "cryptsetup is used to conveniently set up dm-crypt based device-mapper \
targets. It allows to set up targets to read cryptoloop compatible \
volumes as well as LUKS formatted ones. The package additionally \
includes support for automatically setting up encrypted volumes at boot \
time via the config file /etc/crypttab."
LICENSE = "LGPL-2.0-or-later-with-cryptsetup-OpenSSL-exception"

PV = "2.8.7"

RPM_NAME = "libcryptsetup12-2.8.7-1.2.aarch64.rpm"
RPM_HASH = "1b51a18ce1163f9a26528ee82220f650c609a36e3a7762ad37cbe2732289cb7ea4917a7d4f9062497176485c73a86138eb51e75d400033664615ec76448c8262"

RPROVIDES:${PN} += "libcryptsetup.so.12 \
libcryptsetup12 \
libcryptsetup12-hmac"

RDEPENDS:${PN} += "/sbin/ldconfig \
device-mapper \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libcrypto.so.3 \
libdevmapper.so.1.03 \
libjson-c.so.5 \
libuuid.so.1"

inherit rpm
