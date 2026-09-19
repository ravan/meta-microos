SUMMARY = "Mutable hash tables in the ST monad"
DESCRIPTION = "This package provides a couple of different implementations of mutable hash \
tables in the ST monad, as well as a typeclass abstracting their common \
operations, and a set of wrappers to use the hash tables in the IO monad. \
 \
/QUICK START/: documentation for the hash table operations is provided in the \
'Data.HashTable.Class' module, and the IO wrappers (which most users will \
probably prefer) are located in the 'Data.HashTable.IO' module. \
 \
This package currently contains three hash table implementations: \
 \
1. 'Data.HashTable.ST.Cuckoo' contains an implementation of 'cuckoo hashing' as \
introduced by Pagh and Rodler in 2001 (see \
<http://en.wikipedia.org/wiki/Cuckoo_hashing>). Cuckoo hashing has worst-case \
/O(1)/ lookups and can reach a high 'load factor', in which the table can \
perform acceptably well even when approaching 90% full. Randomized testing \
shows this implementation of cuckoo hashing to be slightly faster on insert and \
slightly slower on lookup than 'Data.HashTable.ST.Basic', while being more \
space efficient by about a half-word per key-value mapping. Cuckoo hashing, \
like the basic hash table implementation using linear probing, can suffer from \
long delays when the table is resized. \
 \
2. 'Data.HashTable.ST.Basic' contains a basic open-addressing hash table using \
linear probing as the collision strategy. On a pure speed basis it should \
currently be the fastest available Haskell hash table implementation for \
lookups, although it has a higher memory overhead than the other tables and can \
suffer from long delays when the table is resized because all of the elements \
in the table need to be rehashed. \
 \
3. 'Data.HashTable.ST.Linear' contains a linear hash table (see \
<http://en.wikipedia.org/wiki/Linear_hashing>), which trades some insert and \
lookup performance for higher space efficiency and much shorter delays when \
expanding the table. In most cases, benchmarks show this table to be currently \
slightly faster than 'Data.HashTable' from the Haskell base library. \
 \
It is recommended to create a concrete type alias in your code when using this \
package, i.e.: \
 \
> import qualified Data.HashTable.IO as H > > type HashTable k v = \
H.BasicHashTable k v > > foo :: IO (HashTable Int Int) > foo = do > ht <- H.new \
> H.insert ht 1 1 > return ht \
 \
Firstly, this makes it easy to switch to a different hash table implementation, \
and secondly, using a concrete type rather than leaving your functions abstract \
in the HashTable class should allow GHC to optimize away the typeclass \
dictionaries. \
 \
This package accepts a couple of different cabal flags: \
 \
* 'unsafe-tricks', default /ON/. If this flag is enabled, we use some unsafe \
GHC-specific tricks to save indirections (namely 'unsafeCoerce#' and \
'reallyUnsafePtrEquality#'. These techniques rely on assumptions about the \
behaviour of the GHC runtime system and, although they've been tested and \
should be safe under normal conditions, are slightly dangerous. Caveat emptor. \
In particular, these techniques are incompatible with HPC code coverage \
reports. \
 \
* 'sse42', default /OFF/. If this flag is enabled, we use some SSE 4.2 \
instructions (see <http://en.wikipedia.org/wiki/SSE4>, first available on Intel \
Core 2 processors) to speed up cache-line searches for cuckoo hashing. \
 \
* 'bounds-checking', default /OFF/. If this flag is enabled, array accesses are \
bounds-checked. \
 \
* 'debug', default /OFF/. If turned on, we'll rudely spew debug output to \
stdout. \
 \
* 'portable', default /OFF/. If this flag is enabled, we use only pure Haskell \
code and try not to use unportable GHC extensions. Turning this flag on forces \
'unsafe-tricks' and 'sse42' /OFF/. \
 \
Please send bug reports to \
<https://github.com/gregorycollins/hashtables/issues>."
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "ghc-hashtables-1.4.2-1.20.aarch64.rpm"
RPM_HASH = "c336a9791aae1f24c545a2821bea336b90ab1f6d0a4e299584d0607ba3d8c9780dbd5fd50b6213a99aee53358309be4c99423089c13be5920c297485ff2e74f2"

RPROVIDES:${PN} += "ghc-hashtables \
libHShashtables-1.4.2-FXtFcQfURO18P8ZBa2ZYOT-ghc9.12.4.so"

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
libHSprimitive-0.9.1.0-Ez30Vu7tivmF28X1123Css-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSvector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE-ghc9.12.4.so \
libHSvector-stream-0.1.0.1-FXRnPnZDT7tJ4JCMEuh1XF-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
