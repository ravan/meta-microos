SUMMARY = "DNS server written in Go"
DESCRIPTION = "CoreDNS is a DNS server in Go. It has a plugin architecture for \
extending it. \
 \
CoreDNS can listen for DNS request coming in over UDP/TCP (RFC 1035), \
TLS (RFC 7858) and gRPC (not a standard)."
LICENSE = "Apache-2.0 & MPL-2.0"

PV = "1.14.7"

RPM_NAME = "coredns-1.14.7-2.1.aarch64.rpm"
RPM_HASH = "8e5bc19c643b65b49267e9a14dd0bbf869aae8dd8853adbdd7297a86a31fe54615a804162e96012b22dc07f087f37e02ef8844caf866949110048beb80f5f723"

RPROVIDES:${PN} += "coredns \
dns-daemon"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
