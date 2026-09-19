SUMMARY = "Python support for ZNC"
DESCRIPTION = "ZNC is an IRC bouncer with many features like detaching, multiple \
users, per channel playback buffer, SSL, IPv6, transparent DCC bouncing, and \
C++ module support. \
 \
This package contains the Python extension to ZNC."
LICENSE = "Apache-2.0"

PV = "1.10.3"

RPM_NAME = "znc-python3-1.10.3-1.1.aarch64.rpm"
RPM_HASH = "e5098de559e5b2b12ac7c5785ae6b62852fb9372b3369f17d04ecf8e84c3107670ace370594d4fd05d1e4f8353f9c2a64ee2873db7a8d96f654f01451ac9fe31"

RPROVIDES:${PN} += "znc-python \
znc-python3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
python3 \
znc"

inherit rpm
