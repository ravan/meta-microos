SUMMARY = "IMA/EVM signing utility"
DESCRIPTION = "The evmctl utility can be used for producing and verifying digital signatures, \
which are used by Linux kernel integrity subsystem (IMA/EVM). It can be also \
used to import keys into the kernel keyring."
LICENSE = "GPL-2.0-or-later & GPL-2.0-or-later-with-Linux-syscall-note & LicenseRef-GPL-2.0-with-openssl-exception"

PV = "1.6.2"

RPM_NAME = "evmctl-1.6.2-1.9.aarch64.rpm"
RPM_HASH = "9397f02b3c32b345b04f7a738abbfa79859fe4f782d873be86154b4b2b5e9c7b1f61b63a274b8a6821a1cecc156b4a31a7f1d492ea49ab82777a706df7ee4617"

RPROVIDES:${PN} += "evmctl \
ima-evm-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libimaevm.so.5 \
libkeyutils.so.1 \
libtss2-esys.so.0 \
libtss2-rc.so.0"

inherit rpm
