SUMMARY = "Haskell semigroupoids profiling library"
DESCRIPTION = "This package provides the Haskell semigroupoids profiling library."
LICENSE = "BSD-2-Clause"

PV = "6.0.2"

RPM_NAME = "ghc-semigroupoids-prof-6.0.2-1.3.aarch64.rpm"
RPM_HASH = "c6954c12f5a5004d5c0841ec44e8f4dc2aab7442e1ded2c3e25209889eae4461136c1bb5c3af9fed58812fbf5887e496cebdc3da242cc10fed289245e3e73e7f"

RPROVIDES:${PN} += "ghc-prof-semigroupoids-6.0.2-B6Y5GIvJ2JI8mXJpMQTJaF \
ghc-semigroupoids-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base-orphans-0.9.4-2vMgOxDXOniBrPCxqNGyGO \
ghc-prof-bifunctors-5.6.3-9Dfko6C8LIIe8HG4zoeag \
ghc-prof-comonad-5.0.10-Adp50yscRn74SK6wUdL7QP \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-contravariant-1.5.6-7FVTzec2jegEwzkeRkQOi4 \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-transformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-semigroupoids-devel"

inherit rpm
