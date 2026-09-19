SUMMARY = "DNS server written in Go"
DESCRIPTION = "CoreDNS is a DNS server in Go. It has a plugin architecture for \
extending it. \
 \
CoreDNS can listen for DNS request coming in over UDP/TCP (RFC 1035), \
TLS (RFC 7858) and gRPC (not a standard)."
LICENSE = "Apache-2.0"

PV = "1.14.6"

RPM_NAME = "coredns-for-k8s1.37-1.14.6-1.1.aarch64.rpm"
RPM_HASH = "06a03cd2c469d918dbb5c432d2011658fbdccf825c6618f182f089bc98a1395542124d17d0f2bc87c09fc018fce98e3350d878a076b8bc2d874bce3b058805c1"

RPROVIDES:${PN} += "coredns-for-k8s \
coredns-for-k8s1.37 \
dns-daemon"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
