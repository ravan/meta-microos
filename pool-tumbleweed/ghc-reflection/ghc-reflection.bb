SUMMARY = "Reifies arbitrary terms into types that can be reflected back into terms"
DESCRIPTION = "This package addresses the /configuration problem/ which is propagating \
configurations that are available at run-time, allowing multiple configurations \
to coexist without resorting to mutable global variables or \
'System.IO.Unsafe.unsafePerformIO'. \
 \
That package is an implementation of the ideas presented in the paper \
'Functional Pearl: Implicit Configurations' by Oleg Kiselyov and Chung-chieh \
Shan (<http://okmij.org/ftp/Haskell/tr-15-04.pdf original paper>). \
However, the API has been streamlined to improve performance. \
 \
There are a handful of tutorials on how to use this library: \
 \
* Austin Seipp's tutorial \
<https://www.schoolofhaskell.com/user/thoughtpolice/using-reflection Reflecting \
values to types and back> provides a summary of the approach taken by this \
library, along with more motivating examples. \
 \
* Arnaud Spiwack's tutorial \
<https://www.tweag.io/posts/2017-12-21-reflection-tutorial.html All about \
reflection> explains how to use this library."
LICENSE = "BSD-3-Clause"

PV = "2.1.9"

RPM_NAME = "ghc-reflection-2.1.9-2.12.aarch64.rpm"
RPM_HASH = "2da8c515282bfcf08859e1bfded5d66537aae5fe4c9b10f624431d2c7bf76e3056410df11d50b0646d5132050229c0e3b7f10c8be329f12367452bf4abd90a1c"

RPROVIDES:${PN} += "ghc-reflection \
libHSreflection-2.1.9-D6RNqRhT9cGDEmA5fjQvJF-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
