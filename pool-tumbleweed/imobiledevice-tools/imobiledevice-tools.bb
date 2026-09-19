SUMMARY = "Tools using libimobiledevice for iOS devices"
DESCRIPTION = "libimobiledevice is a software library that talks the protocols to support \
iOS devices. It does not depend on any existing libraries from Apple."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.0+0git.20251010"

RPM_NAME = "imobiledevice-tools-1.4.0+0git.20251010-1.6.aarch64.rpm"
RPM_HASH = "734a0e057833c302b239a4387a9d487cac65c23fbf37ab433034c9f301756f8189969885f02d86a9e447a87414c5cc2d08a6035a772da96e73f21ed7d1d2de09"

RPROVIDES:${PN} += "imobiledevice-tools \
libimobiledevice-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libimobiledevice-1-0-6 \
libimobiledevice-1.0.so.6 \
libimobiledevice-glue-1.0.so.0 \
libplist-2.0.so.4 \
libreadline.so.8 \
libtatsu.so.0 \
libusbmuxd-2.0.so.7"

inherit rpm
