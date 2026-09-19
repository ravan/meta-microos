SUMMARY = "A library for developing the Domain Name System"
DESCRIPTION = "ldns is a C library that can be used for domain name system (DNS) \
development. It supports RFCs like the DNSSEC documents, and allows \
developers to create software conforming to RFCs, as well as \
experimental software for current Internet Drafts. \
 \
This package holds the tools/examples from ldns."
LICENSE = "BSD-3-Clause"

PV = "1.9.2"

RPM_NAME = "ldns-1.9.2-1.4.aarch64.rpm"
RPM_HASH = "753757963e8365e6ad5e150034e30884d6003ef7c51fca630f12dc492731bf82897dc8383f129238e478d9a4a6ad495028e26e62e071befcff6133b9691319b7"

RPROVIDES:${PN} += "ldns"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libldns.so.3 \
libpcap.so.1 \
libssl.so.3"

inherit rpm
