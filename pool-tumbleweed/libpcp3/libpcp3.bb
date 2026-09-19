SUMMARY = "Performance Co-Pilot run-time libraries"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time libraries"
LICENSE = "LGPL-2.1+"

PV = "6.3.8"

RPM_NAME = "libpcp3-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "2e78eb0da6d16f47e3a7a0e54b756bfba791b87dcef27662edd525c5e7682b83e01dc6a661227c63c52086c72bbdb902ad3ee9c479617f1a2f31ac515760aeb9"

RPROVIDES:${PN} += "libpcp-fault.so.3 \
libpcp-pmda.so.3 \
libpcp.so.3 \
libpcp3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libsasl2.so.3 \
libssl.so.3 \
libsystemd.so.0 \
pcp-conf"

inherit rpm
