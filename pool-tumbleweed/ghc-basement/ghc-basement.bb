SUMMARY = "Foundation scrap box of array & string"
DESCRIPTION = "Foundation most basic primitives without any dependencies."
LICENSE = "BSD-3-Clause"

PV = "0.0.16"

RPM_NAME = "ghc-basement-0.0.16-1.32.aarch64.rpm"
RPM_HASH = "8007f8781fd00440cf7059f0159a481f05b934226d6f4e3a1ecdaef512ac458c51bf6975c5897f1f3575c078bd909a9848266fdcf55bfab57d29f0efa038a007"

RPROVIDES:${PN} += "ghc-basement \
libHSbasement-0.0.16-EFfarL5MHPIHNlTrgpSdN2-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
