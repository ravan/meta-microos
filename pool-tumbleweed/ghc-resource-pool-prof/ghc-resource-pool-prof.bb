SUMMARY = "Haskell resource-pool profiling library"
DESCRIPTION = "This package provides the Haskell resource-pool profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.1"

RPM_NAME = "ghc-resource-pool-prof-0.5.0.1-1.1.aarch64.rpm"
RPM_HASH = "0a7f39e3b90fa949605881d6461a5f6f2bdab1bd7e0d431ef2a43f4c18235a4b81eaa3fc590b3987529fd05918b33230f1326f873ee63d398e205af5aa2b851f"

RPROVIDES:${PN} += "ghc-prof-resource-pool-0.5.0.1-CRHTi96cJqx7YSyfyqtukW \
ghc-resource-pool-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-time-1.14-a7dc \
ghc-resource-pool-devel"

inherit rpm
