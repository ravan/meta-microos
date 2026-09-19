SUMMARY = "Simple functional ring type"
DESCRIPTION = "Simple functional bidirectional ring type. Given that the ring terminiology \
clashes with certain mathematical branches, we're using the term CList or \
CircularList instead."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "ghc-data-clist-0.2-3.17.aarch64.rpm"
RPM_HASH = "8a4975c632ba1d9ecc5a06a66a9b70cf8abdf499958a7dca7d1a5979157e11236b3b78bfeed8db168bd827cf01a3ae82de5c98a89ae931524d860d2025a855dc"

RPROVIDES:${PN} += "ghc-data-clist \
libHSdata-clist-0.2-JcMjkvVz4h0BOKvHWv3aRs-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
