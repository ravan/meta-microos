SUMMARY = "Pure priority search queues"
DESCRIPTION = "The psqueues package provides <http://en.wikipedia.org/wiki/Priority_queue \
Priority Search Queues> in three different flavors. \
 \
* 'OrdPSQ k p v', which uses the 'Ord k' instance to provide fast insertion, \
deletion and lookup. This implementation is based on Ralf Hinze's \
<http://citeseer.ist.psu.edu/hinze01simple.html A Simple Implementation \
Technique for Priority Search Queues>. Hence, it is similar to the \
<http://hackage.haskell.org/package/PSQueue PSQueue> library, although it is \
considerably faster and provides a slightly different API. \
 \
* 'IntPSQ p v' is a far more efficient implementation. It fixes the key type to \
'Int' and uses a <http://en.wikipedia.org/wiki/Radix_tree radix tree> (like \
'IntMap') with an additional min-heap property. \
 \
* 'HashPSQ k p v' is a fairly straightforward extension of 'IntPSQ': it simply \
uses the keys' hashes as indices in the 'IntPSQ'. If there are any hash \
collisions, it uses an 'OrdPSQ' to resolve those. The performance of this \
implementation is comparable to that of 'IntPSQ', but it is more widely \
applicable since the keys are not restricted to 'Int', but rather to any \
'Hashable' datatype. \
 \
Each of the three implementations provides the same API, so they can be used \
interchangeably. The benchmarks show how they perform relative to one another, \
and also compared to the other Priority Search Queue implementations on \
Hackage: <http://hackage.haskell.org/package/PSQueue PSQueue> and \
<http://hackage.haskell.org/package/fingertree-psqueue fingertree-psqueue>. \
 \
<<http://i.imgur.com/KmbDKR6.png>> \
 \
<<http://i.imgur.com/ClT181D.png>> \
 \
Typical applications of Priority Search Queues include: \
 \
* Caches, and more specifically LRU Caches; \
 \
* Schedulers; \
 \
* Pathfinding algorithms, such as Dijkstra's and A*."
LICENSE = "BSD-3-Clause"

PV = "0.2.8.3"

RPM_NAME = "ghc-psqueues-0.2.8.3-2.3.aarch64.rpm"
RPM_HASH = "20de3d20f08653dc8a2356f2d287717345854d80806520b47ac9425f53dc70d3ab60de90f9196351c67c448fcd4e89a40743836d2fd6c674d427de012778d4ae"

RPROVIDES:${PN} += "ghc-psqueues \
libHSpsqueues-0.2.8.3-LV1BnLV5SZeHAyWb6kEDRu-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
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
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
