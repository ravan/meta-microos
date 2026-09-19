SUMMARY = "Library to work with PKCS#11 modules"
DESCRIPTION = "p11-kit provides a way to load and enumerate PKCS#11 modules, as well \
as a standard configuration setup for installing PKCS#11 modules in \
such a way that they're discoverable."
LICENSE = "BSD-3-Clause"

PV = "0.26.2"

RPM_NAME = "p11-kit-0.26.2-1.6.aarch64.rpm"
RPM_HASH = "324580a931de2b528022608f0db9d316aac0f29e6f34d9c013f44331f6af5187816d78cb9b1bef86b1013d5391a26e3dbfec784a2ba049219dbe9fe51d269223"

RPROVIDES:${PN} += "p11-kit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libp11-kit.so.0 \
libtasn1.so.6"

inherit rpm
