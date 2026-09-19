SUMMARY = "Linux Key Management Utilities"
DESCRIPTION = "Utilities to control the kernel key management facility and to provide \
a mechanism by which the kernel can call back to user space to get a \
key instantiated."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.6.3"

RPM_NAME = "keyutils-1.6.3-7.10.aarch64.rpm"
RPM_HASH = "dd236dc85183b35d96db1bdd122e3f405670b9a0bce5a28bc2d0bdd22cb26efb5cc5a15d2ca8bd3ef88b074e7677ce565dcc138abbcc1f383bdda49407fa49e3"

RPROVIDES:${PN} += "config-keyutils \
keyutils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkeyutils.so.1 \
libresolv.so.2"

inherit rpm
