SUMMARY = "True Sums of Products"
DESCRIPTION = "Implementation of n-ary sums and n-ary products. \
 \
The module 'Data.SOP' is the main module of this library and contains more \
detailed documentation. \
 \
The main use case of this package is to serve as the core of \
'<https://hackage.haskell.org/package/generics-sop generics-sop>'. \
 \
A detailed description of the ideas behind this library is provided by the \
paper: \
 \
* Edsko de Vries and Andres Löh. \
<http://www.andres-loeh.de/TrueSumsOfProducts True Sums of Products>. \
Workshop on Generic Programming (WGP) 2014."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.2"

RPM_NAME = "ghc-sop-core-0.5.0.2-8.3.aarch64.rpm"
RPM_HASH = "8237819a00fd0ec78b73fd2657e2404d7053fa087b42bd56055e66e048bf39d1802641ece3cb60a284f03ea3e79b6363d35a7501c6c0505cb37e27fbda8511fb"

RPROVIDES:${PN} += "ghc-sop-core \
libHSsop-core-0.5.0.2-JbzyU3U5Jc9a9b8Omhy6m-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
