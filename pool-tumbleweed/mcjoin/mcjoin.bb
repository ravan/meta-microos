SUMMARY = "IPv4 tool for verifying multicast connectivity"
DESCRIPTION = "mcjoin can be used to join IPv4 multicast groups, display \
progress as multicast packets are received, and also send \
multicast packets on select groups. \
 \
mcjoin can help verify intended IGMP snooping functionality \
in layer-2 bridges/switches, as well as test forwarding of \
multicast in static or dynamic multicast routing setups."
LICENSE = "ISC"

PV = "2.12"

RPM_NAME = "mcjoin-2.12-1.5.aarch64.rpm"
RPM_HASH = "c954995c086b9563d52b169a42830c97486977fe16c745d24bff9eead2ad28dbd4e04a280cff2443a72ae2c422b0e0ea7a345d80634f254925da14ea7adb477f"

RPROVIDES:${PN} += "mcjoin"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
