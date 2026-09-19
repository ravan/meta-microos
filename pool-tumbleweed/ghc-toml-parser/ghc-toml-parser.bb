SUMMARY = "TOML 1.1.0 parser"
DESCRIPTION = "TOML parser using generated lexers and parsers with careful attention to the \
TOML 1.1.0 semantics for defining tables."
LICENSE = "ISC"

PV = "2.0.2.0"

RPM_NAME = "ghc-toml-parser-2.0.2.0-2.3.aarch64.rpm"
RPM_HASH = "93db536dff646dfa3dd9ffc103840fb8f9fd2594ad4c3de19716fdc98ccf9e7db6a7a5a0d77eb654f580827acb497ae2652897b47966c3211c2f0464c8cd4244"

RPROVIDES:${PN} += "ghc-toml-parser \
libHStoml-parser-2.0.2.0-5orbE5KlUlGF8qGuEq1R69-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprettyprinter-1.7.2-I8Z9oIqYCiwIS8uRvukUd0-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
