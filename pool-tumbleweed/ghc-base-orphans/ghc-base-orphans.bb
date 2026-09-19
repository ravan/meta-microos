SUMMARY = "Backwards-compatible orphan instances for base"
DESCRIPTION = "'base-orphans' defines orphan instances that mimic instances available in later \
versions of 'base' to a wider (older) range of compilers. \
'base-orphans' does not export anything except the orphan instances themselves \
and complements '<http://hackage.haskell.org/package/base-compat base-compat>'. \
 \
See the README for what instances are covered: \
<https://github.com/haskell-compat/base-orphans#readme>. See also the \
<https://github.com/haskell-compat/base-orphans#what-is-not-covered what is not \
covered> section."
LICENSE = "MIT"

PV = "0.9.4"

RPM_NAME = "ghc-base-orphans-0.9.4-1.3.aarch64.rpm"
RPM_HASH = "9acd0a69d55ede245e554144ca82d604ecb437e1e47e3549e62d40c95236e4d0a2362f314a476c73c30a578cec31fa9e6a3b769c4d675569576b17fad2125a8e"

RPROVIDES:${PN} += "ghc-base-orphans \
libHSbase-orphans-0.9.4-2vMgOxDXOniBrPCxqNGyGO-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
