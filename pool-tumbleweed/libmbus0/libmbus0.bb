SUMMARY = "M-bus Library"
DESCRIPTION = "libmbus is an open source library for the M-bus (Meter-Bus) protocol. \
 \
The Meter-Bus is a standard for reading out meter data from electricity meters, heat meters, gas meters, etc. The M-bus standard deals with both the electrical signals on the M-Bus, and the protocol and data format used in transmissions on the M-Bus. The role of libmbus is to decode/encode M-bus data, and to handle the communication with M-Bus devices."
LICENSE = "BSD-3-Clause"

PV = "0.9.0+59"

RPM_NAME = "libmbus0-0.9.0+59-1.15.aarch64.rpm"
RPM_HASH = "46e89a65570f6c0c43737d61f268fb34223cd98942e4f566338c2c8958843bdc2fc7749c4dca2a1072e0a3c5f1db20eb725cee0b6560cf91df6e000dc3f19a25"

RPROVIDES:${PN} += "libmbus.so.0 \
libmbus0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
