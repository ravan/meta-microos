SUMMARY = "Parallel Internet measurement utility"
DESCRIPTION = "Scamper is a program that is able to conduct Internet measurement \
tasks to large numbers of IPv4 and IPv6 addresses, in parallel, to \
fill a specified packets-per-second rate. Currently, it supports the \
well-known ping and traceroute techniques, as well as MDA traceroute, \
alias resolution, some parts of tbit, sting, and neighbour discovery. \
 \
Scamper can do ICMP-based Path MTU discovery. scamper starts with the \
outgoing interface's MTU and discovers the location of Path MTU \
bottlenecks. scamper performs a PMTUD search when an ICMP \
fragmentation required message is not returned to establish the PMTU \
to the next point in the network, followed by a TTL limited search to \
infer where the failure appears to occur. \
 \
This also contains the Python module."
LICENSE = "GPL-2.0-only"

PV = "20260902"

RPM_NAME = "scamper-20260902-1.1.aarch64.rpm"
RPM_HASH = "012a2dd2ad2ca6794cf00dc9784bd1da30f7f1dc5b04433323a7e5012db8cbe0642b089b434b0adb3b4df4153ceffe592989eb7fe1f2676645067978f4970e20"

RPROVIDES:${PN} += "scamper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libpython3.13.so.1.0 \
libscamperctrl.so.4 \
libscamperfile.so.13 \
libsqlite3.so.0 \
libssl.so.3 \
libz.so.1 \
python-abi"

inherit rpm
