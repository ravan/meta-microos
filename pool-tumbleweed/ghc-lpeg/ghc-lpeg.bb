SUMMARY = "LPeg – Parsing Expression Grammars For Lua"
DESCRIPTION = "This package contains the C sources of LPeg, as well as some tiny Haskell \
helper to load the package. \
 \
<http://www.inf.puc-rio.br/~roberto/lpeg/>."
LICENSE = "MIT"

PV = "1.1.0.1"

RPM_NAME = "ghc-lpeg-1.1.0.1-1.3.aarch64.rpm"
RPM_HASH = "b9ea084136de0ba88927397f83ac61d570d6f6a6f998b81e0586f0583549179f86ab1b143f018b09cce491c04f0d87da03f74dae0505e2f650dcaf14bb3f2370"

RPROVIDES:${PN} += "ghc-lpeg \
libHSlpeg-1.1.0.1-Jbb90xEfizAEuGHvVCZgbp-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSlua-2.3.4-GxTlN73bN8C8KbBhVEtsew-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
