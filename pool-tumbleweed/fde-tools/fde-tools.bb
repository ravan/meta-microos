SUMMARY = "Tools required for Full Disk Encryption"
DESCRIPTION = "This package provides several components required to support Full Disk \
Encryption."
LICENSE = "GPL-2.0-only"

PV = "0.7.7"

RPM_NAME = "fde-tools-0.7.7-1.1.aarch64.rpm"
RPM_HASH = "59fe5945f5b810fad9e4ea47dbdb6c583e103fcfc463c4a72366c0d2e4964b01fabf10c6667bbb5a28be0899c41c2a29ee84c07094cf5c7809353531631aed34"

RPROVIDES:${PN} += "fde-tools \
libcryptsetup-token-grub-tpm2.so"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
cryptsetup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcryptsetup.so.12 \
libfido2.so.1 \
libjson-c.so.5 \
mokutil \
pcr-oracle \
util-linux-systemd"

inherit rpm
