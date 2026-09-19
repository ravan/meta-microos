SUMMARY = "Haskell doclayout profiling library"
DESCRIPTION = "This package provides the Haskell doclayout profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.3"

RPM_NAME = "ghc-doclayout-prof-0.5.0.3-1.3.aarch64.rpm"
RPM_HASH = "d5d3b64348db611b96b0957300775a64beabdeb32cd3e2beb83427c54c189d722bbeb0d8f08ccb5ec81ea0644a1fd080b3eaba4c5a076668a2d130e05785d309"

RPROVIDES:${PN} += "ghc-doclayout-prof \
ghc-prof-doclayout-0.5.0.3-6oU5Og9jiD67xwlm4qJ1ii"

RDEPENDS:${PN} += "ghc-doclayout-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-emojis-0.1.5-AZAxFgnk0gPLtmkqpmmj2s \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-safe-0.3.21-AzRUUYeJ47sQc55olWnva \
ghc-prof-text-2.1.4-cf23"

inherit rpm
