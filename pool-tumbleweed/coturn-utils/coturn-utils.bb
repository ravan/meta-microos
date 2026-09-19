SUMMARY = "Coturn utils"
DESCRIPTION = "This package contains the TURN client utils."
LICENSE = "BSD-3-Clause"

PV = "4.18.0"

RPM_NAME = "coturn-utils-4.18.0-1.1.aarch64.rpm"
RPM_HASH = "6401a01e80b595189a35c3bff6fc6caec841a6b258a8ceccca5392a948648ab0c3210ee0aefad5ade8f0b7ea4df9471498bb49275492a9f57cdee0a5636bc390"

RPROVIDES:${PN} += "coturn-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libevent-core-2.1.so.7 \
libevent-extra-2.1.so.7 \
libevent-pthreads-2.1.so.7 \
libssl.so.3"

inherit rpm
