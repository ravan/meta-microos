SUMMARY = "Backend signal portion for netbird server"
DESCRIPTION = "Optional new relay component for netbird. Please note that this does not \
comprise a full netbird backend server, and is merely built for convenience. \
Management/signal/relay are not required for the netbird client application."
LICENSE = "AGPL-3.0-only & BSD-3-Clause"

PV = "0.78.1"

RPM_NAME = "netbird-relay-0.78.1-1.1.aarch64.rpm"
RPM_HASH = "caa10ef8f175e6f94bdc93e23a865650f925b79506f3a7e169895f1fcec097234161577aab8b672ad3fc75edeb1ed56111ec38c428ba05a27279892668159b7a"

RPROVIDES:${PN} += "netbird-relay"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
