SUMMARY = "Haskell th-reify-many profiling library"
DESCRIPTION = "This package provides the Haskell th-reify-many profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.10"

RPM_NAME = "ghc-th-reify-many-prof-0.1.10-1.23.aarch64.rpm"
RPM_HASH = "58a33cf267f0890d4ba9d5e7469e1fa0b4790f17a477c4623b888d71b5891c5bdfadd56eae6901ebe0a18bf6f2d8fdc98d7ac170d48171363d0ded9a07fc5c7d"

RPROVIDES:${PN} += "ghc-prof-th-reify-many-0.1.10-Y1BMkE9L3hAvIhFuDWL0x \
ghc-th-reify-many-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-safe-0.3.21-AzRUUYeJ47sQc55olWnva \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-th-expand-syns-0.4.12.0-2BWsmg9V6mHJNn5DoPUfmz \
ghc-th-reify-many-devel"

inherit rpm
