SUMMARY = "Semigroupoids: Category sans id"
DESCRIPTION = "Provides a wide array of (semi)groupoids and operations for working with them. \
 \
A 'Semigroupoid' is a 'Category' without the requirement of identity arrows for \
every object in the category. \
 \
A 'Category' is any 'Semigroupoid' for which the Yoneda lemma holds. \
 \
When working with comonads you often have the '<*>' portion of an \
'Applicative', but not the 'pure'. This was captured in Uustalu and Vene's \
'Essence of Dataflow Programming' in the form of the 'ComonadZip' class in the \
days before 'Applicative'. Apply provides a weaker invariant, but for the \
comonads used for data flow programming (found in the streams package), this \
invariant is preserved. Applicative function composition forms a semigroupoid. \
 \
Similarly many structures are nearly a comonad, but not quite, for instance \
lists provide a reasonable 'extend' operation in the form of 'tails', but do \
not always contain a value. \
 \
We describe the relationships between the type classes defined in this package \
and those from `base` (and some from `contravariant`) in the diagram below. \
Thick-bordered nodes correspond to type classes defined in this package; \
thin-bordered ones correspond to type classes from elsewhere. Solid edges \
indicate a subclass relationship that actually exists; dashed edges indicate a \
subclass relationship that /should/ exist, but currently doesn't. \
 \
<<https://raw.githubusercontent.com/ekmett/semigroupoids/master/img/classes.svg \
Relationships among type classes from this package and others>> \
 \
Apply, Bind, and Extend (not shown) give rise the Static, Kleisli and Cokleisli \
semigroupoids respectively. \
 \
This lets us remove many of the restrictions from various monad transformers as \
in many cases the binding operation or '<*>' operation does not require them. \
 \
Finally, to work with these weaker structures it is beneficial to have \
containers that can provide stronger guarantees about their contents, so \
versions of 'Traversable' and 'Foldable' that can be folded with just a \
'Semigroup' are added."
LICENSE = "BSD-2-Clause"

PV = "6.0.2"

RPM_NAME = "ghc-semigroupoids-6.0.2-1.3.aarch64.rpm"
RPM_HASH = "e3cac73297a5537e3cb3cd57b9931bcd5929ae09e0eae3d4ec0ed947bef60ff1e5f4481f78c37bf0ce5a4e9915cdc490ec0bbe5f6fc41d2b18b94078168dbacc"

RPROVIDES:${PN} += "ghc-semigroupoids \
libHSsemigroupoids-6.0.2-B6Y5GIvJ2JI8mXJpMQTJaF-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSStateVar-1.2.2-Fp8KJyjTxyjFvIxRBzfDbA-ghc9.12.4.so \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSassoc-1.1.1-7ZKlIzFkmc1FQCJcpfYrTi-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbase-orphans-0.9.4-2vMgOxDXOniBrPCxqNGyGO-ghc9.12.4.so \
libHSbifunctors-5.6.3-9Dfko6C8LIIe8HG4zoeag-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScomonad-5.0.10-Adp50yscRn74SK6wUdL7QP-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHScontravariant-1.5.6-7FVTzec2jegEwzkeRkQOi4-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSdistributive-0.6.3-9lg1Hxwh2KlJVxh3zQCgyL-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHShashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr-ghc9.12.4.so \
libHSindexed-traversable-0.1.5-JylwuAInS9n4ImeZ4JChDW-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHSth-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHStransformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW-ghc9.12.4.so \
libHSunordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
