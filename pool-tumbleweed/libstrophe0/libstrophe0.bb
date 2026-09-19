SUMMARY = "A XMPP library for C"
DESCRIPTION = "The libstrophe library is a XMPP library written in C."
LICENSE = "GPL-3.0-or-later | MIT"

PV = "0.14.0"

RPM_NAME = "libstrophe0-0.14.0-2.6.aarch64.rpm"
RPM_HASH = "ce114130461e706ec63807b42319b8600f1bd39f6cede94df543d5dabe1cc4fbf6a5322555ceffd70e6a7b7db6a819115ba662f00e3daa4664e408edc6475d83"

RPROVIDES:${PN} += "libstrophe.so.0 \
libstrophe0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
libxml2.so.16 \
libz.so.1"

inherit rpm
