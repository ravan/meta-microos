SUMMARY = "Haskell replace-megaparsec profiling library"
DESCRIPTION = "This package provides the Haskell replace-megaparsec profiling library."
LICENSE = "BSD-2-Clause"

PV = "1.5.0.1"

RPM_NAME = "ghc-replace-megaparsec-prof-1.5.0.1-1.12.aarch64.rpm"
RPM_HASH = "d183334423b56d6690654f9decfaad36c61df456c62f112ca984803dd7502a4f2eeef1566964a6380c1bf7a1c59b94a119f108f4a788b4e5a7d710300d3b12da"

RPROVIDES:${PN} += "ghc-prof-replace-megaparsec-1.5.0.1-3raT401RHe83TCy1jsbTxZ \
ghc-replace-megaparsec-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-megaparsec-9.7.1-3bWkE5RywYh6b8gn4lQrB6 \
ghc-prof-parser-combinators-1.3.1-L2vTYvTgTG7FdcDqlc42x9 \
ghc-prof-text-2.1.4-cf23 \
ghc-replace-megaparsec-devel"

inherit rpm
