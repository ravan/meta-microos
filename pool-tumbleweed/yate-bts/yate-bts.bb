SUMMARY = "GSM BTS based on Yet Another Telephony Engine"
DESCRIPTION = "Yate is a telephony engine designed to implement PBX and IVR solutions \
for small to large scale projects. \
This module implements a 2G GSM BTS for Yate. \
At least one transceiver package must also be installed for \
interfacing with the hardware."
LICENSE = "GPL-2.0-or-later & AGPL-3.0-only"

PV = "6.1.0"

RPM_NAME = "yate-bts-6.1.0-3.10.aarch64.rpm"
RPM_HASH = "3c2e2fee7305a4e38f64d88acccb070733976646d72ba46cb9bbdbd500d5248521d3152a990546fca3fa1ab387960ac0be8f0879522df9cb4b0724c627b65afb"

RPROVIDES:${PN} += "config-yate-bts \
yate-bts"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/php \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libyate.so.6.4.0 \
libyateradio.so.6.4.0 \
yate-scripts"

inherit rpm
