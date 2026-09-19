SUMMARY = "Expands type synonyms in Template Haskell ASTs"
DESCRIPTION = "Expands type synonyms in Template Haskell ASTs. \
 \
As of version '0.4.9.0', this library is a small shim on top of the \
'applySubstitution'/'resolveTypeSynonyms' functions from 'th-abstraction', so \
you may want to consider using 'th-abstraction' instead."
LICENSE = "BSD-3-Clause"

PV = "0.4.12.0"

RPM_NAME = "ghc-th-expand-syns-0.4.12.0-2.3.aarch64.rpm"
RPM_HASH = "2b586f45efcde692d9d8c26f68daca342ef977a5db942da5d1d8605969f64f37bf78526d8d41e5db139e09f6e08ece1fe5d98c0de0c59039f658f41c0a292496"

RPROVIDES:${PN} += "ghc-th-expand-syns \
libHSth-expand-syns-0.4.12.0-2BWsmg9V6mHJNn5DoPUfmz-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSsyb-0.7.4-6fi78MDXPhtHdqjdF3SBYJ-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHSth-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
