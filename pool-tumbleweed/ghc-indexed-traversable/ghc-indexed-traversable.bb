SUMMARY = "FunctorWithIndex, FoldableWithIndex, TraversableWithIndex"
DESCRIPTION = "This package provides three useful generalizations: \
 \
' class Functor f => FunctorWithIndex i f | f -> i where imap :: (i -> a -> b) \
-> f a -> f b ' \
 \
' class Foldable f => FoldableWithIndex i f | f -> i where ifoldMap :: Monoid m \
=> (i -> a -> m) -> f a -> m ' \
 \
' class (FunctorWithIndex i t, FoldableWithIndex i t, Traversable t) => \
TraversableWithIndex i t | t -> i where itraverse :: Applicative f => (i -> a \
-> f b) -> t a -> f (t b) ' \
 \
This package contains instances for types in GHC boot libraries. For some \
additional instances see \
[indexed-traversable-instances](https://hackage.haskell.org/package/indexed-traversable-instances). \
 \
The [keys](https://hackage.haskell.org/package/keys) package provides similar \
functionality, but uses (associated) 'TypeFamilies' instead of \
'FunctionalDependencies'."
LICENSE = "BSD-2-Clause"

PV = "0.1.5"

RPM_NAME = "ghc-indexed-traversable-0.1.5-1.3.aarch64.rpm"
RPM_HASH = "692a2ee463586275d3fffd0adbb9e976ed32fb0d5ac67e510768ab37fda233c11531953789990dd172d47eef200c85d755893a23512a982f25be748d36d459e9"

RPROVIDES:${PN} += "ghc-indexed-traversable \
libHSindexed-traversable-0.1.5-JylwuAInS9n4ImeZ4JChDW-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
