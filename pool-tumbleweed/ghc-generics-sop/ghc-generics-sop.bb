SUMMARY = "Generic Programming using True Sums of Products"
DESCRIPTION = "A library to support the definition of generic functions. Datatypes are viewed \
in a uniform, structured way: the choice between constructors is represented \
using an n-ary sum, and the arguments of each constructor are represented using \
an n-ary product. \
 \
The module 'Generics.SOP' is the main module of this library and contains more \
detailed documentation. \
 \
Since version 0.4.0.0, this package is now based on \
'<https://hackage.haskell.org/package/sop-core sop-core>'. The core package \
contains all the functionality of n-ary sums and products, whereas this package \
provides the datatype-generic programming support on top. \
 \
Examples of using this library are provided by the following packages: \
 \
* '<https://hackage.haskell.org/package/basic-sop basic-sop>' basic examples, \
 \
* '<https://hackage.haskell.org/package/pretty-sop pretty-sop>' generic pretty \
printing, \
 \
* '<https://hackage.haskell.org/package/lens-sop lens-sop>' generically \
computed lenses, \
 \
* '<https://hackage.haskell.org/package/json-sop json-sop>' generic JSON \
conversions. \
 \
A detailed description of the ideas behind this library is provided by the \
paper: \
 \
* Edsko de Vries and Andres Löh. \
<http://www.andres-loeh.de/TrueSumsOfProducts True Sums of Products>. \
Workshop on Generic Programming (WGP) 2014."
LICENSE = "BSD-3-Clause"

PV = "0.5.1.4"

RPM_NAME = "ghc-generics-sop-0.5.1.4-2.3.aarch64.rpm"
RPM_HASH = "b152d1a52673cfdc90a6d971cd0751b4bf1237ed1aaef902ee7a70ed14dab15effc8a2f6d88129d639e0871ab1f2a19f447cf9e90278cc2a0c74b91179c4cc8a"

RPROVIDES:${PN} += "ghc-generics-sop \
libHSgenerics-sop-0.5.1.4-AvLlDZ30DmSAgpFaUKsIGG-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSsop-core-0.5.0.2-JbzyU3U5Jc9a9b8Omhy6m-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHSth-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
