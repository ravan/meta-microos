SUMMARY = "DNS server written in Go"
DESCRIPTION = "CoreDNS is a DNS server in Go. It has a plugin architecture for \
extending it. \
 \
CoreDNS can listen for DNS request coming in over UDP/TCP (RFC 1035), \
TLS (RFC 7858) and gRPC (not a standard)."
LICENSE = "Apache-2.0"

PV = "1.12.1"

RPM_NAME = "coredns-for-k8s1.34-1.12.1-2.7.aarch64.rpm"
RPM_HASH = "24729aa4c36318982aba22d41226b2cdf5c3f57cd31a70dd3a410cab7751271197389af55097ce42f70704a156769647a1f98a946686a1b2e90a742d19363793"

RPROVIDES:${PN} += "coredns-for-k8s \
coredns-for-k8s1.34 \
dns-daemon"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
