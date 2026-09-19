SUMMARY = "Backend signal portion for netbird server"
DESCRIPTION = "Optional signal server component for netbird. Please note that this does not \
comprise a full netbird backend server, and is merely built for convenience. \
Management/signal/relay are not required for the netbird client application."
LICENSE = "AGPL-3.0-only & BSD-3-Clause"

PV = "0.78.1"

RPM_NAME = "netbird-signal-0.78.1-1.1.aarch64.rpm"
RPM_HASH = "23fcda8cb3614a6056f255f41b140fbafe0cefc17dc2f49e690525ec869cd87ad6a14566ccec49d961cfccee5c70c22262c55902b428fbf0d8e9bf08027ff54d"

RPROVIDES:${PN} += "netbird-signal"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
