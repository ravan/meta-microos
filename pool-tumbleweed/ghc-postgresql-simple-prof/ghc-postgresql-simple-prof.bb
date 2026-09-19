SUMMARY = "Haskell postgresql-simple profiling library"
DESCRIPTION = "This package provides the Haskell postgresql-simple profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.7.0.1"

RPM_NAME = "ghc-postgresql-simple-prof-0.7.0.1-1.11.aarch64.rpm"
RPM_HASH = "f1736fd72a7269bb55cb0237dac439adb50be669ef187057bd100679450125f76f9ce3603287192237a77bbac0312e1aa909241f7820f0ad6d6a1dbd41417dcb"

RPROVIDES:${PN} += "ghc-postgresql-simple-prof \
ghc-prof-postgresql-simple-0.7.0.1-HgTXZRTLOqN2maTjCO6yZt"

RDEPENDS:${PN} += "ghc-postgresql-simple-devel \
ghc-prof-Only-0.1-JTlBo1y3Iulx07n0z4y7 \
ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-postgresql-libpq-0.11.0.0-H53T8dUwW2oIfn4i9jqgbB \
ghc-prof-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-time-compat-1.9.9-2vndaypoxzm5lJpcdxrQvS \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-uuid-types-1.0.6.1-Hjv8dqZq3Ya2vXZL2YjpUd \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE"

inherit rpm
