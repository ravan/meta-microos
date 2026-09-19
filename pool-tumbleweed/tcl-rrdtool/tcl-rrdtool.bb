SUMMARY = "Tcl bindings for RRDtool"
DESCRIPTION = "RRD is the Acronym for Round Robin Database. RRD is a system to store and \
display time-series data (i.e. network bandwidth, machine-room temperature, \
server load average). This package contains the Tcl bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.11.0"

RPM_NAME = "tcl-rrdtool-1.11.0-1.1.aarch64.rpm"
RPM_HASH = "01ba8709a888bc3b4650c5985ca70d57e2c3a71993ac6d87afb6676cbad399ee056b266c33b1c6620564b904fd9ec33dc5393a0ca457f49d9a39f3628d2f8b5c"

RPROVIDES:${PN} += "tcl-rrdtool"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
librrd.so.8 \
rrdtool \
tcl"

inherit rpm
