SUMMARY = "Extensible IRC services"
DESCRIPTION = "Atheme is a set of modular IRC services (NickServ, ChanServ, etc.) \
designed to link with more than 20 kinds of IRCds. \
Atheme offers both an C API and a Perl interface."
LICENSE = "MIT"

PV = "7.2.12"

RPM_NAME = "atheme-7.2.12-5.6.aarch64.rpm"
RPM_HASH = "7858d7c06ebe8fb151ec7fa3c10fa073f8ec947893c5706239015f259c2f1d51fc05c6e7a2a2d2253d9d65b49b8ad6199fcffefdf64d0182254fe0b24adf9164"

RPROVIDES:${PN} += "atheme \
config-atheme \
group-atheme \
user-atheme"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libathemecore.so.1 \
libc.so.6 \
libcrack.so.2 \
libcrypt.so.1 \
libcrypto.so.3 \
libldap.so.2 \
libm.so.6 \
libmowgli-2.so.0 \
sysuser-shadow"

inherit rpm
