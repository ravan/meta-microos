SUMMARY = "Haskell aeson-pretty profiling library"
DESCRIPTION = "This package provides the Haskell aeson-pretty profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.11"

RPM_NAME = "ghc-aeson-pretty-prof-0.8.11-1.3.aarch64.rpm"
RPM_HASH = "3897dbdeee6332764b49903d9038fd6ad6cb30e27188189eca2b4f621e2d632a306e0cc948c42953ac59d07a60f21f62b4fc501b4209b1e0772b34db40105fa0"

RPROVIDES:${PN} += "ghc-aeson-pretty-prof \
ghc-prof-aeson-pretty-0.8.11-KCQLeDLfEIvAXp36rOTTo7"

RDEPENDS:${PN} += "ghc-aeson-pretty-devel \
ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base-compat-0.14.1-KqldihVKqBMDOTSpHrHMJy \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE"

inherit rpm
