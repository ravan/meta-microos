SUMMARY = "Monadic loops"
DESCRIPTION = "Some useful control operators for looping. \
 \
New in 0.4: STM loop operators have been split into a new package instead of \
being conditionally-built. \
 \
New in 0.3.2.0: various functions for traversing lists and computing \
minima/maxima using arbitrary procedures to compare or score the elements."
LICENSE = "SUSE-Public-Domain"

PV = "0.4.3"

RPM_NAME = "ghc-monad-loops-0.4.3-11.23.aarch64.rpm"
RPM_HASH = "eda7f8169fd8fdd9826c3677dedba456214f51cb966a16fc730f1e46df5863c5eb276e45c75a08d885bc09a1dd7778a756363cbc70009ad7981ee5c498298a30"

RPROVIDES:${PN} += "ghc-monad-loops \
libHSmonad-loops-0.4.3-DnSFazqaMXyCc2HbLgcz0b-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
