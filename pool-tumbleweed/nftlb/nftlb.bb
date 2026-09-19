SUMMARY = "nftables load balancer"
DESCRIPTION = "nftlb a user-space tool that builds a complete load balancer and \
traffic distributor using nftables. \
 \
* Topologies supported: Destination NAT, Source NAT, Direct Server \
  Return and Stateless DNAT. This enables the use of the load \
  balancer in one-armed and two-armed network architectures. \
* Support for both IPv4 and IPv6 families. \
* Multilayer load balancer: DSR in layer 2, IP based load balancing \
  with protocol agnostic at layer 3, and support of load balancing of \
  UDP, TCP and SCTP at layer 4. \
* Multiport support for ranges and lists of ports. \
* Multiple virtual services (or farms) support. \
* Schedulers available: weight, round robin, configurable hash (per \
  IP, port, MAC or combination of them) and symmetric hash. \
* Support of configurable persistence or client-backend affinity with \
  a timeout (per IP, port, MAC or combination of them). \
* Support of security policies per service: white and blacklists \
  (from ingress), queuing to user space filter, filtering of bogus \
  TCP frames, maximum number of established connections, limit TCP \
  RST per second, limit new connections per second and more. \
* Priority support per backend. \
* Live management of virtual services and backends programmatically \
  through a JSON API."
LICENSE = "AGPL-3.0-or-later"

PV = "1.1.0"

RPM_NAME = "nftlb-1.1.0-1.7.aarch64.rpm"
RPM_HASH = "deed7ba93b7afc7419a3221b4fc754fe65b872e973456c008f18e1f836b8827b29b25b5c04daf12e7b3a2c8b79a1261ee7313636b3ab9e25d8bc1b5c05933e40"

RPROVIDES:${PN} += "nftlb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libev.so.4 \
libjansson.so.4 \
libmnl.so.0 \
libnftables.so.1"

inherit rpm
