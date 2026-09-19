SUMMARY = "DNS server written in Go"
DESCRIPTION = "CoreDNS is a DNS server in Go. It has a plugin architecture for \
extending it. \
 \
CoreDNS can listen for DNS request coming in over UDP/TCP (RFC 1035), \
TLS (RFC 7858) and gRPC (not a standard)."
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "coredns-for-k8s1.36-1.14.2-1.4.aarch64.rpm"
RPM_HASH = "9918c38992b573effa0d2ed1e3d044b7d90e9efb276c799924076a829af94700d5fa8892adac3697ac24334a7e24853477dfab92fddc70c7da33da6a22abad1f"

RPROVIDES:${PN} += "coredns-for-k8s \
coredns-for-k8s1.36 \
dns-daemon"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
