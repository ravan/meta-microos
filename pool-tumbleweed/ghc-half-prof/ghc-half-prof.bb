SUMMARY = "Haskell half profiling library"
DESCRIPTION = "This package provides the Haskell half profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.3.3"

RPM_NAME = "ghc-half-prof-0.3.3-3.3.aarch64.rpm"
RPM_HASH = "d815345b3f5706f123d1910c5f9ce476b811d05a831b32eb9e6185825bc4bfcdb28541663edf21d4ded0a4ce2b09bb6e47614540efcf2b55c1fc92682a24983d"

RPROVIDES:${PN} += "ghc-half-prof \
ghc-prof-half-0.3.3-7uW8H7RguCn8iNkagLajaD"

RDEPENDS:${PN} += "ghc-half-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-binary-0.8.9.3-9861 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-template-haskell-2.23.0.0-358a"

inherit rpm
