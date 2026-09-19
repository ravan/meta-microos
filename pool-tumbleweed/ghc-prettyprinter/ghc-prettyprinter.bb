SUMMARY = "A modern, easy to use, well-documented, extensible pretty-printer"
DESCRIPTION = "A modern, easy to use, well-documented, extensible pretty-printer. For more see \
README.md."
LICENSE = "BSD-2-Clause"

PV = "1.7.2"

RPM_NAME = "ghc-prettyprinter-1.7.2-1.3.aarch64.rpm"
RPM_HASH = "0d97a388456575567a0072fb1f916d64769366fe866b606fd7225ac275f68878acb01b2f77635061f7b29a20e00e7d24c4a8e5e2f076dc800d92937d1ad4a8db"

RPROVIDES:${PN} += "ghc-prettyprinter \
libHSprettyprinter-1.7.2-I8Z9oIqYCiwIS8uRvukUd0-ghc9.12.4.so"

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
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
