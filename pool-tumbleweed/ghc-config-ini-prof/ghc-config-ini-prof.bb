SUMMARY = "Haskell config-ini profiling library"
DESCRIPTION = "This package provides the Haskell config-ini profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.7.0"

RPM_NAME = "ghc-config-ini-prof-0.2.7.0-2.32.aarch64.rpm"
RPM_HASH = "1bd070cb092b638833b2c54919b82972ba7b56661071eb566107a9e2b4d6836152748f2595fc6f406fdf01dc919f31feb4b1fdfe51be04d44c8e5057427e6e07"

RPROVIDES:${PN} += "ghc-config-ini-prof \
ghc-prof-config-ini-0.2.7.0-7oGnb0uYOjJ1nTfrjTJt8v"

RDEPENDS:${PN} += "ghc-config-ini-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-megaparsec-9.7.1-3bWkE5RywYh6b8gn4lQrB6 \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu"

inherit rpm
