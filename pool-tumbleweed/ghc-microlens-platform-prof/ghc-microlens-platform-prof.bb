SUMMARY = "Haskell microlens-platform profiling library"
DESCRIPTION = "This package provides the Haskell microlens-platform profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.4.2"

RPM_NAME = "ghc-microlens-platform-prof-0.4.4.2-1.11.aarch64.rpm"
RPM_HASH = "c5ce4cbdd7b7e1c7b4f99690076c829f386a93eb2fb6c07806bcad1b08e26a50f1ad4a2f2d7c36b7f2151ab8b2604c173db15deb625e1c5f0fbd19a69793e63c"

RPROVIDES:${PN} += "ghc-microlens-platform-prof \
ghc-prof-microlens-platform-0.4.4.2-FHpyH8J1vkX1PJSxWPZ8RH"

RDEPENDS:${PN} += "ghc-microlens-platform-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-microlens-0.5.0.0-K1fQqqDyjwS5maOWIXQxx3 \
ghc-prof-microlens-ghc-0.4.15.2-Cj0815upqHk4qg3lDbGmdr \
ghc-prof-microlens-mtl-0.2.1.1-8JUCbV1SpIrJP4FZoU0oV5 \
ghc-prof-microlens-th-0.4.3.18-5y491C8iAr58VYbwqIS2QN \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE"

inherit rpm
