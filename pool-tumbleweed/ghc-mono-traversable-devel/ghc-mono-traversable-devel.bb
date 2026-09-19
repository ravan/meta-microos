SUMMARY = "Haskell mono-traversable library development files"
DESCRIPTION = "This package provides the Haskell mono-traversable library development \
files."
LICENSE = "MIT"

PV = "1.0.21.0"

RPM_NAME = "ghc-mono-traversable-devel-1.0.21.0-1.25.aarch64.rpm"
RPM_HASH = "e197b9110fcfb115ae5d6f56cc13c02ecd375e48838c97c446ab0617c3f7b5d2a4bb7769c226d6cc41a8b93ef69d1f3039fad5fffae2ba18eac2ed60e5002ff3"

RPROVIDES:${PN} += "ghc-devel-mono-traversable-1.0.21.0-7NlL4qRFn1MB3sC5GPCjes \
ghc-mono-traversable-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-split-0.2.5-DF0qBqNymX3Hv5Ta0307xc \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-devel-vector-algorithms-0.9.1.0-KRcdYzVzgLOFSifxDHEL6p \
ghc-mono-traversable"

inherit rpm
