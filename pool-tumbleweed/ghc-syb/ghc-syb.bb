SUMMARY = "Scrap Your Boilerplate"
DESCRIPTION = "This package contains the generics system described in the /Scrap Your \
Boilerplate/ papers (see <http://www.cs.uu.nl/wiki/GenericProgramming/SYB>). \
It defines the 'Data' class of types permitting folding and unfolding of \
constructor applications, instances of this class for primitive types, and a \
variety of traversals."
LICENSE = "BSD-3-Clause"

PV = "0.7.4"

RPM_NAME = "ghc-syb-0.7.4-1.3.aarch64.rpm"
RPM_HASH = "fa7fae514c87c3ddec6ffd9c5f977992852ddd335e06888f0ff2bc2962d9e24a0d67050dffe8e74ecff80cc0e47e2dffe37137ac7860d40fbea9eab704891379"

RPROVIDES:${PN} += "ghc-syb \
libHSsyb-0.7.4-6fi78MDXPhtHdqjdF3SBYJ-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
