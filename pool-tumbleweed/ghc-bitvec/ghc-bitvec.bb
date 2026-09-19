SUMMARY = "Space-efficient bit vectors"
DESCRIPTION = "A newtype over 'Bool' with a better 'Vector' instance: 8x less memory, up to \
3500x faster. \
 \
The <https://hackage.haskell.org/package/vector vector> package represents \
unboxed arrays of 'Bool's spending 1 byte (8 bits) per boolean. This library \
provides a newtype wrapper 'Bit' and a custom instance of an unboxed 'Vector', \
which packs bits densely, achieving an __8x smaller memory footprint.__ The \
performance stays mostly the same; the most significant degradation happens for \
random writes (up to 10% slower). On the other hand, for certain bulk bit \
operations 'Vector' 'Bit' is up to 3500x faster than 'Vector' 'Bool'. \
 \
=== Thread safety \
 \
* 'Data.Bit' is faster, but writes and flips are not thread-safe. This is \
because naive updates are not atomic: they read the whole word from memory, \
then modify a bit, then write the whole word back. Concurrently modifying \
non-intersecting slices of the same underlying array may also lead to \
unexpected results, since they can share a word in memory. * \
'Data.Bit.ThreadSafe' is slower (usually 10-20%), but writes and flips are \
thread-safe. Additionally, concurrently modifying non-intersecting slices of \
the same underlying array works as expected. However, operations that affect \
multiple elements are not guaranteed to be atomic. \
 \
=== Similar packages \
 \
* <https://hackage.haskell.org/package/bv bv> and \
<https://hackage.haskell.org/package/bv-little bv-little> do not offer mutable \
vectors. \
 \
* <https://hackage.haskell.org/package/array array> is memory-efficient for \
'Bool', but lacks a handy 'Vector' interface and is not thread-safe."
LICENSE = "BSD-3-Clause"

PV = "1.1.6.0"

RPM_NAME = "ghc-bitvec-1.1.6.0-1.3.aarch64.rpm"
RPM_HASH = "af4bb29c7e6630f3941320b82cefa1c373dc88c725d008f99f00277390e2d6a3f5357fbfcc9a9f3eb4e30c924612e42ede01d1d4ee9ead1e307990c51fdaad6b"

RPROVIDES:${PN} += "ghc-bitvec \
libHSbitvec-1.1.6.0-AtnZIEu4pqlECh34uLjm5P-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprimitive-0.9.1.0-Ez30Vu7tivmF28X1123Css-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSvector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE-ghc9.12.4.so \
libHSvector-stream-0.1.0.1-FXRnPnZDT7tJ4JCMEuh1XF-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
