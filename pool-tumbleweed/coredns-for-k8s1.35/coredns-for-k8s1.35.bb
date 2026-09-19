SUMMARY = "DNS server written in Go"
DESCRIPTION = "CoreDNS is a DNS server in Go. It has a plugin architecture for \
extending it. \
 \
CoreDNS can listen for DNS request coming in over UDP/TCP (RFC 1035), \
TLS (RFC 7858) and gRPC (not a standard)."
LICENSE = "Apache-2.0"

PV = "1.13.1"

RPM_NAME = "coredns-for-k8s1.35-1.13.1-2.7.aarch64.rpm"
RPM_HASH = "e0c152c2162a38d0ea6230b802b3f431c17ef3a7071471887f8af62c71e8961abe98bb51fdc4c421ec1d39da3563312d46c93bfba18bf21256d578da79519b0b"

RPROVIDES:${PN} += "coredns-for-k8s \
coredns-for-k8s1.35 \
dns-daemon"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
