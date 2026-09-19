SUMMARY = "Test network connectivity at link layer (layer-2)"
DESCRIPTION = "Linkloop is similar to ping, but tests the network connectivity at the \
link layer (layer 2) instead of the network layer (layer 3). \
 \
 \
 \
Authors: \
-------- \
    Oron Peled <oron@actcom.co.il> \
    Dominique Domet de Mont <Dominique.Domet-de-Mont@hp.com>"
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "linkloop-1.0.0-25.5.aarch64.rpm"
RPM_HASH = "670dc38645e5854fdb5916d19fd352d1b05382639fbff811666b305392b248c7cb8d7ac3fed8875a296a1d09d519b793e9549f0487d469fe436b04b1fb3793e6"

RPROVIDES:${PN} += "linkloop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
