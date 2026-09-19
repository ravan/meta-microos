SUMMARY = "Development headers for scamper's binary dump file access library"
DESCRIPTION = "Scamper is a program that is able to conduct Internet measurement \
tasks to large numbers of IPv4 and IPv6 addresses, in parallel, to \
fill a specified packets-per-second rate. Currently, it supports the \
well-known ping and traceroute techniques, as well as MDA traceroute, \
alias resolution, some parts of tbit, sting, and neighbour discovery. \
 \
This package contains development headers and other ancillary files for the \
libscamperfile library."
LICENSE = "GPL-2.0-only"

PV = "20260902"

RPM_NAME = "libscamperfile-devel-20260902-1.1.aarch64.rpm"
RPM_HASH = "7b8e88f594e8749f59999d007c87b7c408243780a272e98d8956a75118df02e6ecd5442ae2c88394b35fb86fcf296d6e33c06498308f6a9679b865fad4c3eb07"

RPROVIDES:${PN} += "libscamperfile-devel"

RDEPENDS:${PN} += "libscamperfile13"

inherit rpm
