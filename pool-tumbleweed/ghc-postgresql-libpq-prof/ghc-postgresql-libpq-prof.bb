SUMMARY = "Haskell postgresql-libpq profiling library"
DESCRIPTION = "This package provides the Haskell postgresql-libpq profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11.0.0"

RPM_NAME = "ghc-postgresql-libpq-prof-0.11.0.0-3.3.aarch64.rpm"
RPM_HASH = "4302aa49cbe2278c7db3d42e5cfd02f6c0e94804409935fd43e8b13de237fa61e76d2e5954e23e48da5dcf04b95c7a56d3f8a1747ce9b81773800256c587fdf5"

RPROVIDES:${PN} += "ghc-postgresql-libpq-prof \
ghc-prof-postgresql-libpq-0.11.0.0-H53T8dUwW2oIfn4i9jqgbB"

RDEPENDS:${PN} += "ghc-postgresql-libpq-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-unix-2.8.8.0-178a"

inherit rpm
