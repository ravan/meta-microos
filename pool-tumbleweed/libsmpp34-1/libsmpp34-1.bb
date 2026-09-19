SUMMARY = "SMPP-3.4 protocol library"
DESCRIPTION = "This library provides the Protocol Data Unit (PDU) handling of the \
SMPP-3.4 protocol. SMPP (Short Message Peer-to-Peer) is a protocol \
providing a data communication interface for the transfer of short \
message data between External Short Messaging Entities, Routing \
Entitites and Message Centres."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.5"

RPM_NAME = "libsmpp34-1-1.14.5-1.4.aarch64.rpm"
RPM_HASH = "3a141e4b0de525dac7897170efa150acbc4b26bd76a0ac00af1162923f154371e42921e62dff46e352d772317e12f7cf94e9d6b7bd56f3e20179b98bf4abe5c9"

RPROVIDES:${PN} += "libsmpp34-1 \
libsmpp34.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
