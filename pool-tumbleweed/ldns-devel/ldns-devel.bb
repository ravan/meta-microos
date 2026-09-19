SUMMARY = "Development files for ldns"
DESCRIPTION = "ldns is a C library that can be used for domain name system (DNS) \
development. It supports RFCs like the DNSSEC documents, and allows \
developers to create software conforming to RFCs, as well as \
experimental software for current Internet Drafts. \
 \
This package holds the development files."
LICENSE = "BSD-3-Clause"

PV = "1.9.2"

RPM_NAME = "ldns-devel-1.9.2-1.4.aarch64.rpm"
RPM_HASH = "7ed0b40965245fdde41f5ac1dc27e3b1d4f7704f4edea8a05e7bf8a1db2eee3e101c407a7f86d2b160325a473eae98a9f8f419730d2eef7c54f7f39cd2c33a0d"

RPROVIDES:${PN} += "ldns-devel \
pkgconfig-ldns"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libldns3 \
pkgconfig-libssl"

inherit rpm
