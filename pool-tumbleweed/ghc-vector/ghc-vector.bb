SUMMARY = "Efficient Arrays"
DESCRIPTION = ". An efficient implementation of 'Int'-indexed arrays (both mutable and \
immutable), with a powerful loop optimisation framework . . It is structured as \
follows: . ['Data.Vector'] Boxed vectors of arbitrary types. . \
['Data.Vector.Unboxed'] Unboxed vectors with an adaptive representation based \
on data type families. . ['Data.Vector.Storable'] Unboxed vectors of 'Storable' \
types. . ['Data.Vector.Primitive'] Unboxed vectors of primitive types as \
defined by the 'primitive' package. 'Data.Vector.Unboxed' is more flexible at \
no performance cost. . ['Data.Vector.Generic'] Generic interface to the vector \
types. . There is also a (draft) tutorial on common uses of vector. . \
* <http://haskell.org/haskellwiki/Numeric_Haskell:_A_Vector_Tutorial>."
LICENSE = "BSD-3-Clause"

PV = "0.13.2.0"

RPM_NAME = "ghc-vector-0.13.2.0-5.3.aarch64.rpm"
RPM_HASH = "10597dfc6eb4d874f3f4bd4a6153ae6a459fb85bcf4d0bd91293beb6227a648efd83464106eea9c875b492b816a26c2e7ea50f78bd6cae26f35b3412af3fa8a9"

RPROVIDES:${PN} += "ghc-vector \
libHSvector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE-ghc9.12.4.so \
libHSvector-0.13.2.0-JkxMTa2gLKkJke17YJOtM5-benchmarks-O2-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSansi-terminal-1.1.5-KiVHPj6W9e81bxE9dBsVtZ-ghc9.12.4.so \
libHSansi-terminal-types-1.1.3-Cca3c5mUWg4AnUjMARf0p6-ghc9.12.4.so \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScolour-2.3.7-LuxtbazHK7IK55ldBice4c-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSdirectory-1.3.10.1-b1d7-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfile-io-0.1.6-8374-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSoptparse-applicative-0.19.0.0-GyrRSLDSSh1GQCxnTYbnDq-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprettyprinter-1.7.2-I8Z9oIqYCiwIS8uRvukUd0-ghc9.12.4.so \
libHSprettyprinter-ansi-terminal-1.1.4-IMyc3qw4SO1C4KUUC4JLom-ghc9.12.4.so \
libHSprimitive-0.9.1.0-Ez30Vu7tivmF28X1123Css-ghc9.12.4.so \
libHSprocess-1.6.26.1-905d-ghc9.12.4.so \
libHSrandom-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh-ghc9.12.4.so \
libHSsplitmix-0.1.3.2-4FIxgclJzmILwETMtGxhg4-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7-ghc9.12.4.so \
libHStasty-1.5.4-1HxvBgEXkE5Beb2ChlE06d-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libHSvector-stream-0.1.0.1-FXRnPnZDT7tJ4JCMEuh1XF-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
