SUMMARY = "Implementation of IEEE 802.1ab"
DESCRIPTION = "This package provides the shared library for lldpd. \
 \
LLDP is an industry standard protocol designed to supplant proprietary \
Link-Layer protocols such as Extreme EDP (Extreme Discovery Protocol) \
and CDP (Cisco Discovery Protocol). The goal of LLDP is to provide an \
inter-vendor compatible mechanism to deliver Link-Layer notifications \
to adjacent network devices."
LICENSE = "MIT"

PV = "1.0.22"

RPM_NAME = "liblldpctl4-1.0.22-2.3.aarch64.rpm"
RPM_HASH = "5bac2d4cde58733faa0d54c5ea3b08465eb62d5f817f6938f6f0871ed03116b427dbeeb0d2dc54b6cec15ee298a8d35ad772c72cfba04192e8a8ccd172e88244"

RPROVIDES:${PN} += "liblldpctl.so.4 \
liblldpctl4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbsd.so.0 \
libc.so.6"

inherit rpm
