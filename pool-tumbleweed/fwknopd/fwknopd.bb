SUMMARY = "The fwknop Server"
DESCRIPTION = "fwknop stands for the 'FireWall KNock OPerator', and implements an authorization \
scheme called Single Packet Authorization (SPA)."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.11"

RPM_NAME = "fwknopd-2.6.11-1.10.aarch64.rpm"
RPM_HASH = "38ec1f4f18098f7a56dfd69186bd7f031da973dd34893b2699ccd5010aba993bf15cd07fd71ea81728cddd65aefc2e9f663aa5bea01529cb4a13e803cf023562"

RPROVIDES:${PN} += "config-fwknopd \
fwknopd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfko.so.3 \
libpcap.so.1 \
systemd"

inherit rpm
