SUMMARY = "A library for developing the Domain Name System"
DESCRIPTION = "ldns is a C library that can be used for domain name system (DNS) \
development. It supports RFCs like the DNSSEC documents, and allows \
developers to create software conforming to RFCs, as well as \
experimental software for current Internet Drafts."
LICENSE = "BSD-3-Clause"

PV = "1.9.2"

RPM_NAME = "libldns3-1.9.2-1.4.aarch64.rpm"
RPM_HASH = "ce7d3c9e4bb8e7dcd4a66d6d2876ce0ed0b80712bf158573fada9eb860cb41f55ae302e925a455648a2c1a17a629eb0732750b856b40630495c4e3667e4de0e5"

RPROVIDES:${PN} += "libldns.so.3 \
libldns3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
