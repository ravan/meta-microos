SUMMARY = "Clock and Network Simulator"
DESCRIPTION = "clknetsim is a tool designed to test programs which synchronize the system \
clock, either over network or from a hardware reference clock. It simulates \
a system or a number of systems connected to each other in a network and \
the tested programs discipline the simulated system clocks. It can be used \
to quickly test how well the programs control the system clocks in various \
conditions or to test the network protocols."
LICENSE = "GPL-2.0-only"

PV = "0+git.20260819"

RPM_NAME = "clknetsim-0+git.20260819-1.1.aarch64.rpm"
RPM_HASH = "d6f642a8dd5660d14049bc9d640de12fb4057b13c64831d22ad689c8a4b3cb142722a0b9d28a4ffd738b755d60f8381efc2bad5cbba8381f247e704805cd9771"

RPROVIDES:${PN} += "clknetsim"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
