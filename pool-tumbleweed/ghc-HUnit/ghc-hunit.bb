SUMMARY = "A unit testing framework for Haskell"
DESCRIPTION = "HUnit is a unit testing framework for Haskell, inspired by the JUnit tool for \
Java, see: <http://www.junit.org>."
LICENSE = "BSD-3-Clause"

PV = "1.6.2.0"

RPM_NAME = "ghc-HUnit-1.6.2.0-2.35.aarch64.rpm"
RPM_HASH = "4a54540cd06d6e69214a105be5e387950e2033ac86b71b168d811b89aa73a62f3f17e8afc936679b34d87812ebb96ef94098815f0be389334e52fbb7cbd4ed84"

RPROVIDES:${PN} += "ghc-HUnit \
libHSHUnit-1.6.2.0-HyPyPtOZKKe7vLdGCWHz7V-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHScall-stack-0.4.0-5oZIckzxOZr1eMyD6xWtI3-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
