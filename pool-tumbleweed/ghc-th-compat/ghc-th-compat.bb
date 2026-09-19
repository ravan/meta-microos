SUMMARY = "Backward- (and forward-)compatible Quote and Code types"
DESCRIPTION = "This package defines a 'Language.Haskell.TH.Syntax.Compat' module, which \
backports the 'Quote' and 'Code' types to work across a wide range of \
'template-haskell' versions. The 'makeRelativeToProject' utility is also \
backported. On recent versions of 'template-haskell' (2.17.0.0 or later), this \
module simply reexports definitions from 'Language.Haskell.TH.Syntax'. \
Refer to the Haddocks for 'Language.Haskell.TH.Syntax.Compat' for examples of \
how to use this module."
LICENSE = "BSD-3-Clause"

PV = "0.1.7"

RPM_NAME = "ghc-th-compat-0.1.7-1.3.aarch64.rpm"
RPM_HASH = "6b54f36ce655cfa5713ad36ecf7d53934e0c55f4931aa0ad4075ea1b7eb6f9e32aa1f26554920da5d1b542778ec49749070a8b389f635cbcc844afda3d02be3e"

RPROVIDES:${PN} += "ghc-th-compat \
libHSth-compat-0.1.7-A4ZdivYymzPCDISaa5LNtp-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
