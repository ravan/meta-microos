SUMMARY = "Lua bindings for RRDtool"
DESCRIPTION = "RRD is the Acronym for Round Robin Database. RRD is a system to store and \
display time-series data (i.e. network bandwidth, machine-room temperature, \
server load average). This package contains the Lua bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.11.0"

RPM_NAME = "lua-rrdtool-1.11.0-1.1.aarch64.rpm"
RPM_HASH = "7f1f34fbd72d2f4252bbbfa1f44b41efc35bb48946ec3640d0889bc8f89aea133a755a56305edc07cb140b7e79348b3d5150fb66d267662d01b50efa4e114ff4"

RPROVIDES:${PN} += "lua-rrdtool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
librrd.so.8 \
rrdtool"

inherit rpm
