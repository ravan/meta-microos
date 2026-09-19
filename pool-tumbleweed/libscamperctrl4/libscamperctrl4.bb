SUMMARY = "Control library for scamper"
DESCRIPTION = "Scamper is a program that is able to conduct Internet measurement \
tasks to large numbers of IPv4 and IPv6 addresses, in parallel, to \
fill a specified packets-per-second rate. Currently, it supports the \
well-known ping and traceroute techniques, as well as MDA traceroute, \
alias resolution, some parts of tbit, sting, and neighbour discovery. \
 \
This package contains thee library that provides functions to interact \
with a collection of scamper instances."
LICENSE = "GPL-2.0-only"

PV = "20260902"

RPM_NAME = "libscamperctrl4-20260902-1.1.aarch64.rpm"
RPM_HASH = "dfc3b190519c1cd5ead32bbe375cacdd01b924201e6ca8108d52824c317ed8f347d13dea38db62e93710a83b50516878a6864f9bc2d919c15cdbeff1e5fdd125"

RPROVIDES:${PN} += "libscamperctrl.so.4 \
libscamperctrl4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
