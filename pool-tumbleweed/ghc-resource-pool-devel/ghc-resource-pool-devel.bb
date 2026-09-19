SUMMARY = "Haskell resource-pool library development files"
DESCRIPTION = "This package provides the Haskell resource-pool library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.1"

RPM_NAME = "ghc-resource-pool-devel-0.5.0.1-1.1.aarch64.rpm"
RPM_HASH = "a6aafb101fb8989fedc87288ae3c364332c5218a82cd848b68d285f4da0bd99c68c43df7b2d342ee459462c8617122582a6f3a201894fc3953533778104554c5"

RPROVIDES:${PN} += "ghc-devel-resource-pool-0.5.0.1-CRHTi96cJqx7YSyfyqtukW \
ghc-resource-pool-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-time-1.14-a7dc \
ghc-resource-pool"

inherit rpm
