SUMMARY = "Development headers for scamper's control library"
DESCRIPTION = "Scamper is a program that is able to conduct Internet measurement \
tasks to large numbers of IPv4 and IPv6 addresses, in parallel, to \
fill a specified packets-per-second rate. Currently, it supports the \
well-known ping and traceroute techniques, as well as MDA traceroute, \
alias resolution, some parts of tbit, sting, and neighbour discovery. \
 \
This package contains development headers and other ancillary files for the \
libscamperctrl library."
LICENSE = "GPL-2.0-only"

PV = "20260902"

RPM_NAME = "libscamperctrl-devel-20260902-1.1.aarch64.rpm"
RPM_HASH = "c15b41e82ac3d8e4b81d03c26026778716e1ad2893fafacc7d0c05528cd55ae0ea22548a396bb672f3016175a35ef0ee2dc0c9bc37bc4970d25b03deb993baa2"

RPROVIDES:${PN} += "libscamperctrl-devel"

RDEPENDS:${PN} += "libscamperctrl4"

inherit rpm
