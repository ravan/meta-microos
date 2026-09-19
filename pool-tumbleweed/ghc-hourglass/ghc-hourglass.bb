SUMMARY = "Simple performant time related library"
DESCRIPTION = "Simple time library focusing on simple but powerful and performant API \
 \
The backbone of the library are the Timeable and Time type classes. \
 \
Each Timeable instances can be converted to type that has a Time instances, and \
thus are different representations of current time."
LICENSE = "BSD-3-Clause"

PV = "0.2.12"

RPM_NAME = "ghc-hourglass-0.2.12-8.23.aarch64.rpm"
RPM_HASH = "e511bc0fb38d5953efdb4b1631ff109815ef72f43b461ec8930259afd64eb569109639a5949a8bfdb07cd5243dac403d6cd071017ed4f32ff8746fd183ddf1af"

RPROVIDES:${PN} += "ghc-hourglass \
libHShourglass-0.2.12-AVWrQ59TfGxLOqFeNnaO7o-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
