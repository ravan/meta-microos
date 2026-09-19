SUMMARY = "Retrieve information about disk space usage"
DESCRIPTION = "A cross-platform library for retrieving information about disk space usage."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.1"

RPM_NAME = "ghc-disk-free-space-0.1.0.1-5.23.aarch64.rpm"
RPM_HASH = "88d0da30606c2ac510289210b03997b121abc028c3fe13eb2eb2822a7be1964ef5d5e92e9b72f477559dafc9085cc85f44a94b84fa381cfe8f00ecc57cfb194d"

RPROVIDES:${PN} += "ghc-disk-free-space \
libHSdisk-free-space-0.1.0.1-CwfKSebfOn7JGVRYHaYrKk-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
