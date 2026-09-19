SUMMARY = "Haskell data-fix profiling library"
DESCRIPTION = "This package provides the Haskell data-fix profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-data-fix-prof-0.3.4-3.3.aarch64.rpm"
RPM_HASH = "5414b54239c3a3857fb9a5fe38bc2e3deb55518e447af441c5ce084e81b470ff48d4c0161ec7346237768acee487bcea6071230d6d83d813f293a95751e368a7"

RPROVIDES:${PN} += "ghc-data-fix-prof \
ghc-prof-data-fix-0.3.4-CgM6sqdDt42GirAgfXjM4z"

RDEPENDS:${PN} += "ghc-data-fix-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr"

inherit rpm
