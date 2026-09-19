SUMMARY = "Yubikey NEO PKCS#11 applet library"
DESCRIPTION = "This is a PKCS#11 module that allows to communicate with the PIV application running on a YubiKey"
LICENSE = "BSD-2-Clause"

PV = "2.7.3"

RPM_NAME = "libykcs11-2-2.7.3-1.3.aarch64.rpm"
RPM_HASH = "32474392e3e25860a7ec6d67d8141f3dc19bdc5da778cb20304e0e3e31f1b047ac7311f688dcdf37591be7735847fd7b3cef2d73604b402518cee45403edfbd5"

RPROVIDES:${PN} += "libykcs11-2 \
libykcs11.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libykpiv.so.2 \
pcsc-ccid"

inherit rpm
