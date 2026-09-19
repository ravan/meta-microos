SUMMARY = "Haskell mono-traversable profiling library"
DESCRIPTION = "This package provides the Haskell mono-traversable profiling library."
LICENSE = "MIT"

PV = "1.0.21.0"

RPM_NAME = "ghc-mono-traversable-prof-1.0.21.0-1.25.aarch64.rpm"
RPM_HASH = "1482c47743d8810abbf40fc7a4301dfe02513429ae09b218ddf57d0a2aac95b6343ad13432815dc179a36277326692b9e2764768dbf1ddcc1480f68812090a59"

RPROVIDES:${PN} += "ghc-mono-traversable-prof \
ghc-prof-mono-traversable-1.0.21.0-7NlL4qRFn1MB3sC5GPCjes"

RDEPENDS:${PN} += "ghc-mono-traversable-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-split-0.2.5-DF0qBqNymX3Hv5Ta0307xc \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-prof-vector-algorithms-0.9.1.0-KRcdYzVzgLOFSifxDHEL6p"

inherit rpm
