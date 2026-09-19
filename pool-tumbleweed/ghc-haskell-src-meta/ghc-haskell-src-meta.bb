SUMMARY = "Parse source to template-haskell abstract syntax"
DESCRIPTION = "The translation from haskell-src-exts abstract syntax to template-haskell \
abstract syntax isn't 100% complete yet."
LICENSE = "BSD-3-Clause"

PV = "0.8.15"

RPM_NAME = "ghc-haskell-src-meta-0.8.15-2.3.aarch64.rpm"
RPM_HASH = "46743e28e0cfa1dffe48c388921baef2b372557c7e20122fbe5ad65466e1342f35e074e11bb8a9e46fea79643fe1dbf19bb04530dc4ec95ee275fce0c51345ee"

RPROVIDES:${PN} += "ghc-haskell-src-meta \
libHShaskell-src-meta-0.8.15-FnQqpPy0mwl8lKE5H2GQu6-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHShaskell-src-exts-1.23.1-2QXJ6YmpNBDADgPssiT27j-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSsafe-0.3.21-AzRUUYeJ47sQc55olWnva-ghc9.12.4.so \
libHSsyb-0.7.4-6fi78MDXPhtHdqjdF3SBYJ-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHSth-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7-ghc9.12.4.so \
libHSth-compat-0.1.7-A4ZdivYymzPCDISaa5LNtp-ghc9.12.4.so \
libHSth-expand-syns-0.4.12.0-2BWsmg9V6mHJNn5DoPUfmz-ghc9.12.4.so \
libHSth-lift-0.8.7-C08bSURuEXt2IuYgZMzZEc-ghc9.12.4.so \
libHSth-orphans-0.13.17-JrR2fnTKxP4E1CBKEHbpQ2-ghc9.12.4.so \
libHSth-reify-many-0.1.10-Y1BMkE9L3hAvIhFuDWL0x-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
