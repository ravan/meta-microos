SUMMARY = "Advanced IRC Bouncer"
DESCRIPTION = "ZNC is an IRC bouncer with many features like detaching, multiple \
users, per channel playback buffer, SSL, IPv6, transparent DCC bouncing, and \
C++ module support."
LICENSE = "Apache-2.0"

PV = "1.10.3"

RPM_NAME = "znc-1.10.3-1.1.aarch64.rpm"
RPM_HASH = "0e60d449ba757b6d789042efccbb07fc5da5702a039d4ce4332b74aa8ab9939a5a4268188d09a7ff910aedb6bfd3af9fb1550c369f0dfdf7f69c0e25787b230e"

RPROVIDES:${PN} += "group-znc \
user-znc \
znc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libargon2.so.1 \
libboost-locale.so.1.91.0 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libicuuc.so.78 \
libsasl2.so.3 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1 \
shadow"

inherit rpm
