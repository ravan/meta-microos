SUMMARY = "Haskell crypton-pem profiling library"
DESCRIPTION = "This package provides the Haskell crypton-pem profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "ghc-crypton-pem-prof-0.3.0-1.3.aarch64.rpm"
RPM_HASH = "a99fcedbdec75c76831be7db195007ab2bc11afc43ede8f681c60be7e9f2573ebdacc87a71e6cf10fd2692249d185e2b871a0b5e29a3878d92f02f29943a9976"

RPROVIDES:${PN} += "ghc-crypton-pem-prof \
ghc-prof-crypton-pem-0.3.0-EDGHx08iNeQDGxg4A2t7ij"

RDEPENDS:${PN} += "ghc-crypton-pem-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base64-1.0-Ca310PwaD9pGmjzA3S4jr6 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-text-2.1.4-cf23"

inherit rpm
