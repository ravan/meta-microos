SUMMARY = "Use GHC call-stacks in a backward compatible way"
DESCRIPTION = "Use GHC call-stacks in a backward compatible way."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "ghc-call-stack-0.4.0-2.35.aarch64.rpm"
RPM_HASH = "a3ee90de07811a94276aae206b6958ee6db489913939eea26269a654ce449c6880126137e96cae7f806cbd4651e5ae05033f09106b43a6e941067f8afa5810a9"

RPROVIDES:${PN} += "ghc-call-stack \
libHScall-stack-0.4.0-5oZIckzxOZr1eMyD6xWtI3-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
