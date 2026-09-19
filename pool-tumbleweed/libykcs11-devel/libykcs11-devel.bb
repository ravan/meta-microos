SUMMARY = "Development files for the Yubikey NEO PKCS#11 applet library"
DESCRIPTION = "This package contains the header file needed to develop applications that use \
Yubikey NEO PKCS#11 applet library."
LICENSE = "BSD-2-Clause"

PV = "2.7.3"

RPM_NAME = "libykcs11-devel-2.7.3-1.3.aarch64.rpm"
RPM_HASH = "d608d7085fd51dcb17fcd9d8a4e4e4d6cdf2321e361ccb12d0fa9a315919d63b4c8a4c86651fcd15d8d9f850aacd34a3caacb75558d1dcd4ec51eebf2cc20d3f"

RPROVIDES:${PN} += "libykcs11-devel \
pkgconfig-ykcs11"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libykcs11-2"

inherit rpm
