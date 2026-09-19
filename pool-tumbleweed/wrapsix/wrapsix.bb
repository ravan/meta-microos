SUMMARY = "Software implementation of NAT64"
DESCRIPTION = "WrapSix is a NAT64 gateway, implemented in userspace. So far, it is \
faster than than Ecdysis (a kernelspace implementation) and Tayga \
(another userspace implementation)."
LICENSE = "GPL-3.0-only"

PV = "0.2.1"

RPM_NAME = "wrapsix-0.2.1-2.17.aarch64.rpm"
RPM_HASH = "838d00373971516c33bb95d96edfd61351dbb330e67d94d357761791a2bb37cc92ca5a6929bfe7ef882ee513c9761af95d3a3572f253782de5c49d4a6ab98e7b"

RPROVIDES:${PN} += "config-wrapsix \
wrapsix"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
systemd"

inherit rpm
