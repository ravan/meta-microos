SUMMARY = "Bridging between UDP tunnels, Ethernet and TAP interfaces"
DESCRIPTION = "uBridge is a simple application to create user-land bridges between \
various technologies. Currently bridging between UDP tunnels, \
Ethernet and TAP interfaces is supported.  Packet capture is also \
supported."
LICENSE = "GPL-3.0-only"

PV = "1.2.3"

RPM_NAME = "ubridge-1.2.3-1.1.aarch64.rpm"
RPM_HASH = "08c1e65a70f1e230bedf9084688809ff885c363db0204696bdbc13caab59a3733c6b0623f27d2bd033f07e67c152a942e2ea067e72d359a02c494fb645e27159"

RPROVIDES:${PN} += "ubridge"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libiniparser.so.4 \
libm.so.6 \
libpcap.so.1"

inherit rpm
