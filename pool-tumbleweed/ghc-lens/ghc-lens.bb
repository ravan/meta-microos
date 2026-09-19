SUMMARY = "Lenses, Folds and Traversals"
DESCRIPTION = "This package comes 'Batteries Included' with many useful lenses for the types \
commonly used from the Haskell Platform, and with tools for automatically \
generating lenses and isomorphisms for user-supplied data types. \
 \
The combinators in 'Control.Lens' provide a highly generic toolbox for \
composing families of getters, folds, isomorphisms, traversals, setters and \
lenses and their indexed variants. \
 \
An overview, with a large number of examples can be found in the \
<https://github.com/ekmett/lens#lens-lenses-folds-and-traversals README>. \
 \
An introductory video on the style of code used in this library by Simon Peyton \
Jones is available from \
<https://archive.org/details/lenses-compositional-data-access-and-manipulation-simon-peyton-jones-at-haskell- \
Internet Archive>. \
 \
A video on how to use lenses and how they are constructed is available on \
<http://youtu.be/cefnmjtAolY?hd=1 youtube>. \
 \
Slides for that second talk can be obtained from \
<http://comonad.com/haskell/Lenses-Folds-and-Traversals-NYC.pdf comonad.com>. \
 \
More information on the care and feeding of lenses, including a brief tutorial \
and motivation for their types can be found on the \
<https://github.com/ekmett/lens/wiki lens wiki>. \
 \
A small game of 'pong' and other more complex examples that manage their state \
using lenses can be found in the \
<https://github.com/ekmett/lens/blob/master/examples/ example folder>. \
 \
/Lenses, Folds and Traversals/ \
 \
With some signatures simplified, the core of the hierarchy of lens-like \
constructions looks like: \
 \
<<https://raw.githubusercontent.com/ekmett/lens/master/images/Hierarchy.png>> \
 \
You can compose any two elements of the hierarchy above using '(.)' from the \
'Prelude', and you can use any element of the hierarchy as any type it linked \
to above it. \
 \
The result is their lowest upper bound in the hierarchy (or an error if that \
bound doesn't exist). \
 \
For instance: \
 \
* You can use any 'Traversal' as a 'Fold' or as a 'Setter'. \
 \
* The composition of a 'Traversal' and a 'Getter' yields a 'Fold'. \
 \
/Minimizing Dependencies/ \
 \
If you want to provide lenses and traversals for your own types in your own \
libraries, then you can do so without incurring a dependency on this (or any \
other) lens package at all. \
 \
/e.g./ for a data type: \
 \
> data Foo a = Foo Int Int a \
 \
You can define lenses such as \
 \
> -- bar :: Lens' (Foo a) Int > bar :: Functor f => (Int -> f Int) -> Foo a -> \
f (Foo a) > bar f (Foo a b c) = fmap (a' -> Foo a' b c) (f a) \
 \
> -- quux :: Lens (Foo a) (Foo b) a b > quux :: Functor f => (a -> f b) -> Foo \
a -> f (Foo b) > quux f (Foo a b c) = fmap (Foo a b) (f c) \
 \
without the need to use any type that isn't already defined in the 'Prelude'. \
 \
And you can define a traversal of multiple fields with \
'Control.Applicative.Applicative': \
 \
> -- traverseBarAndBaz :: Traversal' (Foo a) Int > traverseBarAndBaz :: \
Applicative f => (Int -> f Int) -> Foo a -> f (Foo a) > traverseBarAndBaz f \
(Foo a b c) = Foo <$> f a <*> f b <*> pure c \
 \
What is provided in this library is a number of stock lenses and traversals for \
common haskell types, a wide array of combinators for working them, and more \
exotic functionality, (/e.g./ getters, setters, indexed folds, isomorphisms)."
LICENSE = "BSD-2-Clause"

PV = "5.3.6"

RPM_NAME = "ghc-lens-5.3.6-1.3.aarch64.rpm"
RPM_HASH = "01ac385818e915ed59e2e52f9127fa2329f6cba512f8c64d09c1339e3a2863b09ee099d946c0367042b8afd393e88221b1c386e8a790c42ef66bd8e2a5d91701"

RPROVIDES:${PN} += "ghc-lens \
libHSlens-5.3.6-J5P8ydEQLUbA8WXxD5pRjA-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSOneTuple-0.4.3-6DcV56rVPgKHcnOuxvKUVo-ghc9.12.4.so \
libHSStateVar-1.2.2-Fp8KJyjTxyjFvIxRBzfDbA-ghc9.12.4.so \
libHSadjunctions-4.4.4-4nqsP3yaf6U1iY0vApuE6e-ghc9.12.4.so \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSassoc-1.1.1-7ZKlIzFkmc1FQCJcpfYrTi-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbase-orphans-0.9.4-2vMgOxDXOniBrPCxqNGyGO-ghc9.12.4.so \
libHSbifunctors-5.6.3-9Dfko6C8LIIe8HG4zoeag-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScall-stack-0.4.0-5oZIckzxOZr1eMyD6xWtI3-ghc9.12.4.so \
libHScomonad-5.0.10-Adp50yscRn74SK6wUdL7QP-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHScontravariant-1.5.6-7FVTzec2jegEwzkeRkQOi4-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSdistributive-0.6.3-9lg1Hxwh2KlJVxh3zQCgyL-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSfree-5.2-4eWU5ydqIMF46nGJ3OnruR-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHShashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr-ghc9.12.4.so \
libHSindexed-traversable-0.1.5-JylwuAInS9n4ImeZ4JChDW-ghc9.12.4.so \
libHSindexed-traversable-instances-0.1.2.1-6YpZT8gBjiD9ssAaPGVbKH-ghc9.12.4.so \
libHSinvariant-0.6.5-DrqO3CbAMrLCl36mqBRofr-ghc9.12.4.so \
libHSkan-extensions-5.2.8-BhPXqlF7GPZ4azZSK3TJ3I-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSparallel-3.2.2.0-DHmdQd1fQsJFTMvpGLTdNS-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprimitive-0.9.1.0-Ez30Vu7tivmF28X1123Css-ghc9.12.4.so \
libHSprofunctors-5.6.3-CPqBm5VgzT9DSAiXWxFcrG-ghc9.12.4.so \
libHSreflection-2.1.9-D6RNqRhT9cGDEmA5fjQvJF-ghc9.12.4.so \
libHSsemigroupoids-6.0.2-B6Y5GIvJ2JI8mXJpMQTJaF-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHSstrict-0.5.1-9s5NAvHzvkrI18NRIQgFhz-ghc9.12.4.so \
libHStagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHSth-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7-ghc9.12.4.so \
libHSthese-1.2.1-IItOvRyyn8cFsXxaqiOQHG-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHStransformers-base-0.4.6.1-AexBYmHB9CZDEWAojzlCzB-ghc9.12.4.so \
libHStransformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW-ghc9.12.4.so \
libHSunordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu-ghc9.12.4.so \
libHSvector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE-ghc9.12.4.so \
libHSvector-stream-0.1.0.1-FXRnPnZDT7tJ4JCMEuh1XF-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
