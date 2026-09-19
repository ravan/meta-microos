SUMMARY = "Haskell crypton profiling library"
DESCRIPTION = "This package provides the Haskell crypton profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.4"

RPM_NAME = "ghc-crypton-prof-1.1.4-1.3.aarch64.rpm"
RPM_HASH = "5b107eaab46f02d648e29cf2f94cecbbc1ad0a0033219990a2f894145c48643490984d45856926ed772108e2cca5aedd62f105b2880add41ea8266d373ad2dc5"

RPROVIDES:${PN} += "ghc-crypton-prof \
ghc-prof-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB"

RDEPENDS:${PN} += "ghc-crypton-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base16-1.0-GqCyVT5DfwtBcN8MC2i0Li \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-integer-gmp-1.1-09fd \
ghc-prof-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-prof-ram-0.22.0-4Io46KcWliV5ncwh4lemlr \
ghc-prof-text-2.1.4-cf23"

inherit rpm
