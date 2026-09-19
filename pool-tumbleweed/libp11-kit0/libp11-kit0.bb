SUMMARY = "Library to work with PKCS#11 modules"
DESCRIPTION = "p11-kit provides a way to load and enumerate PKCS#11 modules, as well \
as a standard configuration setup for installing PKCS#11 modules in \
such a way that they're discoverable."
LICENSE = "BSD-3-Clause"

PV = "0.26.2"

RPM_NAME = "libp11-kit0-0.26.2-1.6.aarch64.rpm"
RPM_HASH = "c0f09466dd36bd1b8ebbf2225d8bcee7585d771d8962c90d0f3077351434dbd602e6cc9495d173d4bd59628de7926d056677c07999c0ece0e999e71b8f5f54f1"

RPROVIDES:${PN} += "libp11-kit.so.0 \
libp11-kit0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8"

inherit rpm
