SUMMARY = "M-bus Library"
DESCRIPTION = "libmbus is an open source library for the M-bus (Meter-Bus) protocol. \
 \
The Meter-Bus is a standard for reading out meter data from electricity meters, heat meters, gas meters, etc. The M-bus standard deals with both the electrical signals on the M-Bus, and the protocol and data format used in transmissions on the M-Bus. The role of libmbus is to decode/encode M-bus data, and to handle the communication with M-Bus devices."
LICENSE = "BSD-3-Clause"

PV = "0.9.0+59"

RPM_NAME = "libmbus-0.9.0+59-1.15.aarch64.rpm"
RPM_HASH = "fa5a29af7d27f9d0690d080f19bf8b2b19dad004ea5786e9570638f114fa0789b6f0b56064f7516e0784cea0d07da95731ff0022951420d08c97b48d2d6c6b31"

RPROVIDES:${PN} += "libmbus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmbus.so.0"

inherit rpm
