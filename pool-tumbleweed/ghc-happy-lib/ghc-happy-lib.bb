SUMMARY = "Happy is a parser generator for Haskell implemented using this library"
DESCRIPTION = "Happy is a parser generator for Haskell. Given a grammar specification in BNF, \
Happy generates Haskell code to parse the grammar. Happy works in a similar way \
to the 'yacc' tool for C. \
 \
This library provides the following functionality: \
 \
* Data type definitions for the Grammar AST type, capturing the information in \
.y-files (Happy.Grammar) \
 \
* A parser for happy grammar files (.y) to produce a Grammar (Happy.Frontend.*) \
 \
* Implementations of the text book algorithms that compute the LR action and \
goto tables for the given 'Grammar' (Happy.Tabular.*) \
 \
* An LALR code generator to produce table-driven, deterministic parsing code in \
Haskell (Happy.Backend.LALR.*) \
 \
* A (less maintained) GLR code generator to produce table-driven, \
non-deterministic parsing code in Haskell, where ambiguous parses produce \
multiple parse trees (Happy.Backend.GLR.*)."
LICENSE = "BSD-2-Clause"

PV = "2.1.7"

RPM_NAME = "ghc-happy-lib-2.1.7-1.9.aarch64.rpm"
RPM_HASH = "20b2bfd9af92faf27a4074f01a95977f725f761ca7f2b35ec5e2a4a89b164f36df9c96b802faa5b3885aad8882e1a1f1e14f204ea1c2b3cde33ee84ceb1e318a"

RPROVIDES:${PN} += "ghc-happy-lib \
libHShappy-lib-2.1.7-1bWmFhbsdZL4XZsKjWEDXF-grammar-ghc9.12.4.so \
libHShappy-lib-2.1.7-6xaKMZ2LurcJEr6RopPQyG-tabular-ghc9.12.4.so \
libHShappy-lib-2.1.7-Dnzy2qXbK7YFIzoRs44leY-backend-glr-ghc9.12.4.so \
libHShappy-lib-2.1.7-IRIqf5BOccQCIZdepGy2z4-backend-lalr-ghc9.12.4.so \
libHShappy-lib-2.1.7-KSfVv5ihL2Q77EsIw4onBy-frontend-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
