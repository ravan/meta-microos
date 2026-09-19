SUMMARY = "RDAP command line client"
DESCRIPTION = "OpenRDAP is an command line Registration Data Access Protocol (RDAP) client implementation in Go. \
Supports all RDAP query types (domain, ip, asn, help, nameserver, and searches). \
Automatic query type detection (domain, ip, asn queries). \
Full bootstrapping support (using data.iana.org, or a custom URL)."
LICENSE = "MIT"

PV = "0.10.2"

RPM_NAME = "rdap-0.10.2-1.1.aarch64.rpm"
RPM_HASH = "22beaf7893869ad6cf5ad925441cdda54664f51e7813847418618752981ec37df0c0f1224a0e3b4c8565711131766a1f1d3fdfafb098f11fed67e98132d15b5b"

RPROVIDES:${PN} += "rdap"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
