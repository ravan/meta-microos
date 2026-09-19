SUMMARY = "File access library for scamper's binary dump format"
DESCRIPTION = "Scamper is a program that is able to conduct Internet measurement \
tasks to large numbers of IPv4 and IPv6 addresses, in parallel, to \
fill a specified packets-per-second rate. Currently, it supports the \
well-known ping and traceroute techniques, as well as MDA traceroute, \
alias resolution, some parts of tbit, sting, and neighbour discovery. \
 \
This package contains the library that provides access to the binary output \
files that scamper can produce in certain modes."
LICENSE = "GPL-2.0-only"

PV = "20260902"

RPM_NAME = "libscamperfile13-20260902-1.1.aarch64.rpm"
RPM_HASH = "ed6175298349009a2e6577cef551da066471263a298d92f604faff6bd3d14032eee15f8f3a30a5647d6f7943592e81d8063fd99b04aa1879c70c82b90daf247d"

RPROVIDES:${PN} += "libscamperfile.so.13 \
libscamperfile13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
