SUMMARY = "Haskell cassava profiling library"
DESCRIPTION = "This package provides the Haskell cassava profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.4.1"

RPM_NAME = "ghc-cassava-prof-0.5.4.1-1.11.aarch64.rpm"
RPM_HASH = "3037b784669d5ede7dfa8738ac61374c025112f098f79bec35cb53f1117ef0acb5e2269f0d03c7748a5ba30980c49f80c1863e23a756fae1264bfec0c312a318"

RPROVIDES:${PN} += "ghc-cassava-prof \
ghc-prof-cassava-0.5.4.1-8IyxQgBHHLo5YfhT4Ar4sR"

RDEPENDS:${PN} += "ghc-cassava-devel \
ghc-prof-Only-0.1-JTlBo1y3Iulx07n0z4y7 \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-text-short-0.1.6.1-K3gVAGEPLemvxyg6g1yq \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE"

inherit rpm
