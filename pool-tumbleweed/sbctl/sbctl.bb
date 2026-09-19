SUMMARY = "Secure Boot key manager"
DESCRIPTION = "sbctl intends to be a user-friendly secure boot key manager capable of setting \
up secure boot, offer key management capabilities, and keep track of files that \
needs to be signed in the boot chain."
LICENSE = "MIT"

PV = "0.18"

RPM_NAME = "sbctl-0.18-2.7.aarch64.rpm"
RPM_HASH = "d597bfa489ba485e81dbf72cb1e5aacf87898472c877de5b3216dd25d33ac1e25ced2a25bb1e2c1ec62cc49347578451e68f2a184cc4bf514c01a0eb77d7d5c2"

RPROVIDES:${PN} += "sbctl"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
binutils \
libc.so.6 \
libpcsclite.so.1 \
util-linux-systemd"

inherit rpm
