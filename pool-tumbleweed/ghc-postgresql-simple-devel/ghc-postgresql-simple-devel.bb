SUMMARY = "Haskell postgresql-simple library development files"
DESCRIPTION = "This package provides the Haskell postgresql-simple library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.7.0.1"

RPM_NAME = "ghc-postgresql-simple-devel-0.7.0.1-1.11.aarch64.rpm"
RPM_HASH = "be467303634bf0d1614fce8bc1cf1345b4496b650021dabf17bdafd5374e489dd3888f2a7921ff7448fbfc742c795db959673398e839ac25aca9cbc73a253587"

RPROVIDES:${PN} += "ghc-devel-postgresql-simple-0.7.0.1-HgTXZRTLOqN2maTjCO6yZt \
ghc-postgresql-simple-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-Only-0.1-JTlBo1y3Iulx07n0z4y7 \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-postgresql-libpq-0.11.0.0-H53T8dUwW2oIfn4i9jqgbB \
ghc-devel-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-time-compat-1.9.9-2vndaypoxzm5lJpcdxrQvS \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-uuid-types-1.0.6.1-Hjv8dqZq3Ya2vXZL2YjpUd \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-postgresql-simple"

inherit rpm
