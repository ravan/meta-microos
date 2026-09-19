SUMMARY = "Runtime library needed by both fax server and client"
DESCRIPTION = "This runtime lib is needed by both the fax server and the client."
LICENSE = "BSD-3-Clause"

PV = "7.0.11"

RPM_NAME = "libfaxutil7_0_11-7.0.11-2.4.aarch64.rpm"
RPM_HASH = "a2e94b378e979e7ffc2b2a88415fa3df52eafadddccf4a13b0bd5434f7e5cabbe1d68caf7bf6366e59a6d884027e2158674bfffaf0ad9a9222847eac839b7cb0"

RPROVIDES:${PN} += "libfaxutil.so.7.0.11 \
libfaxutil7-0-11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtiff.so.6 \
libz.so.1"

inherit rpm
