SUMMARY = "Specify refactorings to perform with apply-refact"
DESCRIPTION = "This library provides a datatype which can be interpreted by apply-refact. \
It exists as a seperate library so that applications can specify refactorings \
without depending on GHC."
LICENSE = "BSD-3-Clause"

PV = "0.3.0.2"

RPM_NAME = "ghc-refact-0.3.0.2-4.19.aarch64.rpm"
RPM_HASH = "430cb88f7d4e38cf6c326e308ef86fdc4ecb3d0f565cda343ea766c53aba7e78414de08224e0b64afce1dc78d92623e6c4e883c4459fa96baa33f6b84898c891"

RPROVIDES:${PN} += "ghc-refact \
libHSrefact-0.3.0.2-BbwdNckJT1UJcRbLtga6Lt-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
