SUMMARY = "A program to ping multiple hosts"
DESCRIPTION = "FPing is a ping-like program that uses the Internet Control Message \
Protocol (ICMP) echo request to determine if a target host is \
responding. FPing differs from ping in that you can specify any number \
of targets on the command line or specify a file containing a list of \
targets to ping. Instead of sending pings to one target until it times \
out or replies, FPing sends a ping packet and moves on to the next \
target in a round-robin fashion. \
 \
In the default mode, if a target replies, it is noted and removed from \
the list of targets to check. If a target does not respond within a \
certain time limit or retry limit, it is designated as unreachable. \
FPing also supports sending a specified number of pings to a target or \
looping indefinitely (as in ping). \
 \
Unlike ping, FPing is meant to be used in scripts. Its output is \
designed to be easy to parse."
LICENSE = "MIT"

PV = "5.5"

RPM_NAME = "fping-5.5-1.4.aarch64.rpm"
RPM_HASH = "116f5e689b9485e648ffd1d1bc73dea9a02bf8bc228b5283f85230e96c8f027d033d8566ad739465cde8d25ceb9155bb10fd8c0cf0176e0609b69b57b80017af"

RPROVIDES:${PN} += "fping"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
permissions"

inherit rpm
