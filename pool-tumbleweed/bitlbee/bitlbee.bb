SUMMARY = "IRC to other Chat Networks Gateway"
DESCRIPTION = "BitlBee is a gateway between instant messaging and an IRC client. \
With it, one's IRC client program can be reused and no extra IM program \
will need to run. \
 \
This package comes with support for MSN, Jabber, Oscar and Yahoo, as well as \
enabled flood protection."
LICENSE = "GPL-2.0-only"

PV = "3.6"

RPM_NAME = "bitlbee-3.6-5.11.aarch64.rpm"
RPM_HASH = "1246e5b8e9a7e92dd1a14655d6df1b0d4e235000aea6d97712dfaad4ba37df30f8cc17068ec6ec05e6763a39b4fd7ff813c13176b05412ebf3bf038fba8fe954"

RPROVIDES:${PN} += "bitlbee \
config-bitlbee"

RDEPENDS:${PN} += "/usr/bin/sh \
group-bitlbee \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnutls.so.30 \
libm.so.6 \
libotr.so.5 \
libpurple.so.0 \
libresolv.so.2 \
logrotate \
shadow \
user-bitlbee"

inherit rpm
