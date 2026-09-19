SUMMARY = "Qt wrapper for libolm"
DESCRIPTION = "This is a Qt wrapper for libolm."
LICENSE = "GPL-3.0-only"

PV = "3.0.1"

RPM_NAME = "libQtOlm3_0-3.0.1-1.22.aarch64.rpm"
RPM_HASH = "d29e0e6911bd0993ddaddb54d57b506f45dc3579cb9a83f5d4ab0bd8db23444b43e14d266d30c1ee2c93d512ec184cc04f29565695c8826fd7f0cef7c84b3393"

RPROVIDES:${PN} += "libQtOlm.so.3.0 \
libQtOlm3-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libolm.so.3 \
libstdc++.so.6"

inherit rpm
