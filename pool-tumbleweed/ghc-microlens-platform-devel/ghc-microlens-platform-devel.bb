SUMMARY = "Haskell microlens-platform library development files"
DESCRIPTION = "This package provides the Haskell microlens-platform library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.4.4.2"

RPM_NAME = "ghc-microlens-platform-devel-0.4.4.2-1.11.aarch64.rpm"
RPM_HASH = "3d5d65e74ae9b3059058e396d7a3765974a603fa8c0304b7e4f6299858cdb231227d9436a0821e64ba10d92eaa2ed232d94882967dc19963ac17db8533d2f948"

RPROVIDES:${PN} += "ghc-devel-microlens-platform-0.4.4.2-FHpyH8J1vkX1PJSxWPZ8RH \
ghc-microlens-platform-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-microlens-0.5.0.0-K1fQqqDyjwS5maOWIXQxx3 \
ghc-devel-microlens-ghc-0.4.15.2-Cj0815upqHk4qg3lDbGmdr \
ghc-devel-microlens-mtl-0.2.1.1-8JUCbV1SpIrJP4FZoU0oV5 \
ghc-devel-microlens-th-0.4.3.18-5y491C8iAr58VYbwqIS2QN \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-microlens-platform"

inherit rpm
