SUMMARY = "Headers for the lldpd implementation"
DESCRIPTION = "This package is required to develop alternate clients for lldpd. \
 \
LLDP is an industry standard protocol designed to supplant proprietary \
Link-Layer protocols such as Extreme EDP (Extreme Discovery Protocol) \
and CDP (Cisco Discovery Protocol). The goal of LLDP is to provide an \
inter-vendor compatible mechanism to deliver Link-Layer notifications \
to adjacent network devices."
LICENSE = "MIT"

PV = "1.0.22"

RPM_NAME = "lldpd-devel-1.0.22-2.3.aarch64.rpm"
RPM_HASH = "c442a853023c4994c23a27e71879d2d4877e0047a3c2c74088f8246011a6d9bfdc5a6559960f5da00501d8b548aaee8a25c34a62e2b234adbb28447e8f41fd50"

RPROVIDES:${PN} += "lldpd-devel \
pkgconfig-lldpctl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblldpctl4"

inherit rpm
