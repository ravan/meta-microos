SUMMARY = "Backend management portion for netbird server"
DESCRIPTION = "Optional management server component for netbird. Please note that this does not \
comprise a full netbird backend server, and is merely built for convenience. \
Management/signal/relay are not required for the netbird client application."
LICENSE = "AGPL-3.0-only & BSD-3-Clause"

PV = "0.78.1"

RPM_NAME = "netbird-management-0.78.1-1.1.aarch64.rpm"
RPM_HASH = "aaf653b64ffe92aa0780f43a92612bf9a281d571c7185ab853a6036bd18352cf391f04ca56a41a25312cb1a0410fce9338e5b7bea06eb1c7f908afee13e01c59"

RPROVIDES:${PN} += "netbird-management"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
