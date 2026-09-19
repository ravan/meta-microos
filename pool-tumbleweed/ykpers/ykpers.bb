SUMMARY = "Reference implementation for configuration of YubiKeys"
DESCRIPTION = "Yubico's YubiKey can be re-programmed. This project provides a reference implementation for configuration of YubiKeys."
LICENSE = "BSD-2-Clause"

PV = "1.20.0"

RPM_NAME = "ykpers-1.20.0-3.18.aarch64.rpm"
RPM_HASH = "8ace9957a5e83b8948bee671c5275f0c7a7dfc6667269d00dfd66a7495cf5ac7f5bea88712a4d4abe0deaf9d3cb735faf5f1a2cc9a5383c1f7cd18b3c3ef881b"

RPROVIDES:${PN} += "ykpers \
yubikey-personalization"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libykpers-1.so.1 \
libyubikey.so.0"

inherit rpm
