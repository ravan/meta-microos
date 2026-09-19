SUMMARY = "Ruby bindings for RRDtool"
DESCRIPTION = "RRD is the Acronym for Round Robin Database. RRD is a system to store and \
display time-series data (i.e. network bandwidth, machine-room temperature, \
server load average). This package contains documentation on using RRD. \
 \
This package contains the Ruby bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.11.0"

RPM_NAME = "ruby-rrdtool-1.11.0-1.1.aarch64.rpm"
RPM_HASH = "5f2d483c6b39f29ea9ac46e6229ded86ffa02f21afc28b427f14f4a09f6fac06a1621d5dc3f3532f6dd6e95d10692a4fad1d44a7540ca0c0870ba46edd3994b8"

RPROVIDES:${PN} += "ruby-rrdtool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
librrd.so.8 \
libruby4.0.so.4.0 \
rrdtool \
ruby-abi"

inherit rpm
