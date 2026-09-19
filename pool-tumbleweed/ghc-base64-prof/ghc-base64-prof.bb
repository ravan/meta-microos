SUMMARY = "Haskell base64 profiling library"
DESCRIPTION = "This package provides the Haskell base64 profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "ghc-base64-prof-1.0-1.3.aarch64.rpm"
RPM_HASH = "d79fb2d3b58962648aee7feba605cedff993fc2d85d13eea9796ac64b6ddbf1952e45f21ab3e01e85ecc678dc8d1ed0a226cd01e56d509b62c3bf5e55f8a65c3"

RPROVIDES:${PN} += "ghc-base64-prof \
ghc-prof-base64-1.0-Ca310PwaD9pGmjzA3S4jr6"

RDEPENDS:${PN} += "ghc-base64-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-text-short-0.1.6.1-K3gVAGEPLemvxyg6g1yq"

inherit rpm
