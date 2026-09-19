SUMMARY = "High-level XMPP Library for C++"
DESCRIPTION = "gloox is a portable high-level Jabber/XMPP library for C++. It is fully \
compliant with the XMPP RFCs, supports all of the XMPP features (including \
SRV lookups, TLS, SASL, roster management, and privacy lists), and implements \
several XEPs that make it ideal for writing any kind of Jabber/XMPP client \
or component."
LICENSE = "GPL-3.0-only"

PV = "1.0.28"

RPM_NAME = "libgloox18-1.0.28-1.10.aarch64.rpm"
RPM_HASH = "4dfbf4df3330d96a594bc9dc9e1106c9314fe5c5fa40747312ea58e128280403c4c123704cb648cdaedc6e5357a19c965b9f075d61c3225c282e7eb8012fc6ce"

RPROVIDES:${PN} += "libgloox.so.18 \
libgloox18"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnutls.so.30 \
libidn.so.12 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
