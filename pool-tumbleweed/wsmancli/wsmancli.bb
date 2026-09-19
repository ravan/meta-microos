SUMMARY = "Command line client utilities for WS-Management"
DESCRIPTION = "This package provides 'wsman', a CLI utility for resource management \
over the WS-Management protocol. \
 \
Also included is 'wseventmgr', a CLI utility for event management over \
the WS-Management protocol."
LICENSE = "BSD-3-Clause"

PV = "2.8.0"

RPM_NAME = "wsmancli-2.8.0-3.5.aarch64.rpm"
RPM_HASH = "1f8e5e3628b29fc301cdc7083635d9466088dced4866f64c774386dc4b5f3253f318aea532d8bcd7d5bc4c55d1b5000b9bfbc3c293dc72e06069685bb02e3af7"

RPROVIDES:${PN} += "wsmancli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwsman-client.so.5 \
libwsman-curl-client-transport.so.1 \
libwsman.so.1"

inherit rpm
