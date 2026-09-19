SUMMARY = "Haskell semigroupoids library development files"
DESCRIPTION = "This package provides the Haskell semigroupoids library development files."
LICENSE = "BSD-2-Clause"

PV = "6.0.2"

RPM_NAME = "ghc-semigroupoids-devel-6.0.2-1.3.aarch64.rpm"
RPM_HASH = "8129740f8278b2abd0afb231a454dba0ae187c9f175249c7b00e3d9dce3e61c5788a2ad3a32aec6178bf237bf24809c325d7f0e1c45f03b696a6bddfe4dc548e"

RPROVIDES:${PN} += "ghc-devel-semigroupoids-6.0.2-B6Y5GIvJ2JI8mXJpMQTJaF \
ghc-semigroupoids-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base-orphans-0.9.4-2vMgOxDXOniBrPCxqNGyGO \
ghc-devel-bifunctors-5.6.3-9Dfko6C8LIIe8HG4zoeag \
ghc-devel-comonad-5.0.10-Adp50yscRn74SK6wUdL7QP \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-contravariant-1.5.6-7FVTzec2jegEwzkeRkQOi4 \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-transformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-semigroupoids"

inherit rpm
