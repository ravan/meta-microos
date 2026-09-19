SUMMARY = "Header files for libcryptsetup"
DESCRIPTION = "cryptsetup is used to conveniently set up dm-crypt based device-mapper \
targets. It allows to set up targets to read cryptoloop compatible \
volumes as well as LUKS formatted ones. The package additionally \
includes support for automatically setting up encrypted volumes at boot \
time via the config file /etc/crypttab."
LICENSE = "LGPL-2.0-or-later-with-cryptsetup-OpenSSL-exception"

PV = "2.8.7"

RPM_NAME = "libcryptsetup-devel-2.8.7-1.2.aarch64.rpm"
RPM_HASH = "af4ee47249320d349477e66804cd99176ac2804e2c740aee0eaa7582d171bf574c9ac74983eaf388c376ed881085d8e26ce68ebece8d68f0c81f7c63aa558eb6"

RPROVIDES:${PN} += "cryptsetup-devel \
libcryptsetup-devel \
pkgconfig-libcryptsetup"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libcryptsetup12 \
pkgconfig-blkid \
pkgconfig-devmapper \
pkgconfig-json-c \
pkgconfig-openssl \
pkgconfig-uuid"

inherit rpm
