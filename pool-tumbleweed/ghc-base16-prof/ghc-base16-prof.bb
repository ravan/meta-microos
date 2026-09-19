SUMMARY = "Haskell base16 profiling library"
DESCRIPTION = "This package provides the Haskell base16 profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "ghc-base16-prof-1.0-1.3.aarch64.rpm"
RPM_HASH = "137d9afc4fb6aff4e352efeab85fc9fd009e7c6a2ce1e1dce5cca9a97231a85fbb8e94e7222396ce22a81cc87e1cea551f7f93f9dc368000c7c04cb1c8b06719"

RPROVIDES:${PN} += "ghc-base16-prof \
ghc-prof-base16-1.0-GqCyVT5DfwtBcN8MC2i0Li"

RDEPENDS:${PN} += "ghc-base16-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-text-short-0.1.6.1-K3gVAGEPLemvxyg6g1yq"

inherit rpm
