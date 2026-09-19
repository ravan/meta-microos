SUMMARY = "Haskell mlkem profiling library"
DESCRIPTION = "This package provides the Haskell mlkem profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.0"

RPM_NAME = "ghc-mlkem-prof-0.2.1.0-1.3.aarch64.rpm"
RPM_HASH = "ee910798a10eb589bed5fe5dc0b893af49d851a1cd061fac235cbe6ae522e35b3a15160b92a1d924889737758afdbac093c65b0771a224f919505242714b4310"

RPROVIDES:${PN} += "ghc-mlkem-prof \
ghc-prof-mlkem-0.2.1.0-I3LOwjV1LZnU6D8hY2Ok5"

RDEPENDS:${PN} += "ghc-mlkem-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-prof-ram-0.22.0-4Io46KcWliV5ncwh4lemlr"

inherit rpm
