SUMMARY = "Extensible exceptions"
DESCRIPTION = "This package provides extensible exceptions for both new and old versions of \
GHC (i.e., < 6.10)."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.4"

RPM_NAME = "ghc-extensible-exceptions-0.1.1.4-7.23.aarch64.rpm"
RPM_HASH = "93a8a40c8dbc25c80c6eaa933747c3762d83552c81e5195c37476de81c6060398ac26780d2973ffb4a11098da5b48460eefa0bf4537f22328da57c967123f76b"

RPROVIDES:${PN} += "ghc-extensible-exceptions \
libHSextensible-exceptions-0.1.1.4-1DqJiZkXnDRHRXNZtok1ZU-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
