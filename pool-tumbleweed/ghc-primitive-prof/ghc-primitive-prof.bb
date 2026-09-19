SUMMARY = "Haskell primitive profiling library"
DESCRIPTION = "This package provides the Haskell primitive profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.9.1.0"

RPM_NAME = "ghc-primitive-prof-0.9.1.0-2.3.aarch64.rpm"
RPM_HASH = "e0e7ce18915ab2ee9022a78420280c6d114d50de22073cd7f54611d249d6aa4d1cc6a50862d0e8610589d2be4275b573333dbcc46dbefff81338a87ec5e033c8"

RPROVIDES:${PN} += "ghc-primitive-prof \
ghc-prof-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css"

RDEPENDS:${PN} += "ghc-primitive-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
