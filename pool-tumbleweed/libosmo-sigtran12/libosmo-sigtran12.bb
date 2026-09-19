SUMMARY = "Osmocom SIGTRAN library"
DESCRIPTION = "libosmo-sigtran is a C-language library implementation of a variety \
of telecom signaling protocols, such as M3UA, SUA, SCCP (connection \
oriented and connectionless). SCCP is a network layer protocol that \
provides extended routing, flow control, segmentation, \
connection-orientation, and error correction facilities in Signaling \
System 7 telecommunications networks. SCCP is heavily used in \
cellular networks such as GSM. \
 \
OsmoSTP is a SS7 Transfer Point that can be used to act as router and \
translator between M3UA, SUA and/or SCCPlite."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.0"

RPM_NAME = "libosmo-sigtran12-2.3.0-1.1.aarch64.rpm"
RPM_HASH = "1cd40cba20e5aec2a63df0c97a8912fb61b81d7c7e2d4c16870105c0afca4b69e63c6cb7719c8b7272d72ad5403d79a0a896f19f6b336551d57482d5d25fba15"

RPROVIDES:${PN} += "libosmo-sigtran.so.12 \
libosmo-sigtran12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmo-asn1-tcap.so.1 \
libosmocore.so.22 \
libosmogsm.so.20 \
libosmonetif.so.11 \
libosmovty.so.13 \
libtalloc.so.2"

inherit rpm
