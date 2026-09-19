SUMMARY = "Haskell base library development files"
DESCRIPTION = "This package provides the Haskell base library development files."
LICENSE = "BSD-3-Clause"

PV = "4.21.2.0"

RPM_NAME = "ghc-base-devel-4.21.2.0-1.3.aarch64.rpm"
RPM_HASH = "6ede35c680bb3c7380cda8ff05e18ab24e8dc01044f75735b81c0a01b37169e59dcd4fe91d481c89ac1aad5f1217a8d32d2b57cd21668b3229c9d1ba1e6a6ab6"

RPROVIDES:${PN} += "ghc-base-devel \
ghc-base-static \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-devel-integer-gmp-1.1-09fd \
ghc-devel-rts-1.0.3 \
ghc-devel-system-cxx-std-lib-1.0"

RDEPENDS:${PN} += "ghc-base \
ghc-compiler \
ghc-devel-ghc-bignum-1.3-03b0 \
ghc-devel-ghc-internal-9.1204.0-f1e1 \
gmp-devel \
libdw-devel \
libelf-devel \
libffi-devel \
libnuma-devel"

inherit rpm
