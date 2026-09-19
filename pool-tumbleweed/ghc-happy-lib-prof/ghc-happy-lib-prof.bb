SUMMARY = "Haskell happy-lib profiling library"
DESCRIPTION = "This package provides the Haskell happy-lib profiling library."
LICENSE = "BSD-2-Clause"

PV = "2.1.7"

RPM_NAME = "ghc-happy-lib-prof-2.1.7-1.9.aarch64.rpm"
RPM_HASH = "450c5811d72d59fe2108ff8636b4cefd8f8e35168abac786ab063e9a94aa769b13ad698f970c08b808be494fa2a48b5eac19822ddc3fc9cc5e52c04c8f55b4a8"

RPROVIDES:${PN} += "ghc-happy-lib-prof \
ghc-prof-happy-lib-2.1.7-1bWmFhbsdZL4XZsKjWEDXF-grammar \
ghc-prof-happy-lib-2.1.7-6xaKMZ2LurcJEr6RopPQyG-tabular \
ghc-prof-happy-lib-2.1.7-Dnzy2qXbK7YFIzoRs44leY-backend-glr \
ghc-prof-happy-lib-2.1.7-IRIqf5BOccQCIZdepGy2z4-backend-lalr \
ghc-prof-happy-lib-2.1.7-KSfVv5ihL2Q77EsIw4onBy-frontend"

RDEPENDS:${PN} += "ghc-happy-lib-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
