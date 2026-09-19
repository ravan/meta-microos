SUMMARY = "Yubico YubiKey NEO CCID Manager"
DESCRIPTION = "This is a command line tool to interact with the PIV applet on a YubiKey NEO. \
Among other functions it supports, generating keys on device, importing keys \
and certificates and creating certificate requests."
LICENSE = "BSD-2-Clause"

PV = "2.7.3"

RPM_NAME = "yubico-piv-tool-2.7.3-1.3.aarch64.rpm"
RPM_HASH = "0bbb9165f0d9a4b9f06b6f19a6d937c87f3d7db1de0cd218e841835bac6be364d4e5a5c513977fa3064d0b86c39b901cc36427ccddb786cdf8b2412849c4ebb3"

RPROVIDES:${PN} += "yubico-piv-tool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libykcs11-2 \
libykpiv.so.2 \
libykpiv2 \
libz.so.1"

inherit rpm
