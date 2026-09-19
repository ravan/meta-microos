SUMMARY = "Binding to the ALSA Library API (Exceptions)"
DESCRIPTION = "This package provides access to ALSA infrastructure, that is needed by both \
alsa-seq and alsa-pcm."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.1"

RPM_NAME = "ghc-alsa-core-0.5.0.1-4.20.aarch64.rpm"
RPM_HASH = "1831270c10b7b487abf1f0e2a1745c96db8c87f915d45c03876d2390b09d50cc490f31eb4745bbbba86fd730f1166bb7f67ad25446b35621a902799e2aeeb29f"

RPROVIDES:${PN} += "ghc-alsa-core \
libHSalsa-core-0.5.0.1-5pqfH6YvvEZ2vsBkGGr8JL-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSextensible-exceptions-0.1.1.4-1DqJiZkXnDRHRXNZtok1ZU-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libasound.so.2 \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
