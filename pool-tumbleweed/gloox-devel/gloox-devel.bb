SUMMARY = "High-level XMPP Library for C++"
DESCRIPTION = "gloox is a portable high-level Jabber/XMPP library for C++. It is fully \
compliant with the XMPP RFCs, supports all of the XMPP features (including \
SRV lookups, TLS, SASL, roster management, and privacy lists), and implements \
several XEPs that make it ideal for writing any kind of Jabber/XMPP client \
or component."
LICENSE = "GPL-3.0-only"

PV = "1.0.28"

RPM_NAME = "gloox-devel-1.0.28-1.10.aarch64.rpm"
RPM_HASH = "15013259cc05faea689783d37d1348bfdc7bc5dc61d41d7d9c9cfc68cc51ee01ab5a0a5e1fcbe00bbaba5f88e1cbf530b6e4a079e762c47def9b2c99bf255394"

RPROVIDES:${PN} += "gloox-devel \
pkgconfig-gloox"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libgloox18 \
libstdc++-devel"

inherit rpm
