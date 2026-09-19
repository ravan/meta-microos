SUMMARY = "Strict data types and String IO"
DESCRIPTION = "This package provides strict versions of some standard Haskell data types \
(pairs, Maybe and Either). It also contains strict IO operations. \
 \
It is common knowledge that lazy datastructures can lead to space-leaks. \
This problem is particularly prominent, when using lazy datastructures to store \
the state of a long-running application in memory. One common solution to this \
problem is to use 'seq' and its variants in every piece of code that updates \
your state. However a much easier solution is to use fully strict types to \
store such state values. By 'fully strict types' we mean types for whose values \
it holds that, if they are in weak-head normal form, then they are also in \
normal form. Intuitively, this means that values of fully strict types cannot \
contain unevaluated thunks. \
 \
To define a fully strict datatype, one typically uses the following recipe. \
 \
1. Make all fields of every constructor strict; i.e., add a bang to all fields. \
 \
2. Use only strict types for the fields of the constructors. \
 \
The second requirement is problematic as it rules out the use of the standard \
Haskell 'Maybe', 'Either', and pair types. This library solves this problem by \
providing strict variants of these types and their corresponding standard \
support functions and type-class instances. \
 \
Note that this library does currently not provide fully strict lists. \
They can be added if they are really required. However, in many cases one \
probably wants to use unboxed or strict boxed vectors from the 'vector' library \
(<http://hackage.haskell.org/package/vector>) instead of strict lists. \
Moreover, instead of 'String's one probably wants to use strict 'Text' values \
from the 'text' library (<http://hackage.haskell.org/package/text>). \
 \
This library comes with batteries included; i.e., mirror functions and \
instances of the lazy versions in 'base'. It also includes instances for \
type-classes from the 'deepseq', 'binary', and 'hashable' packages."
LICENSE = "BSD-3-Clause"

PV = "0.5.1"

RPM_NAME = "ghc-strict-0.5.1-2.16.aarch64.rpm"
RPM_HASH = "0be49308574a420c73669e06ea273b5e1c466219d04e7d3c5d86bc0e9deb50d4b3a893ff3c8920ca23117f022ebe800a9934faf4d796ddd0c30d53ff911134c9"

RPROVIDES:${PN} += "ghc-strict \
libHSstrict-0.5.1-9s5NAvHzvkrI18NRIQgFhz-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSassoc-1.1.1-7ZKlIzFkmc1FQCJcpfYrTi-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHShashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHSthese-1.2.1-IItOvRyyn8cFsXxaqiOQHG-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
