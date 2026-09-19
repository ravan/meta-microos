SUMMARY = "Haskell auto-update profiling library"
DESCRIPTION = "This package provides the Haskell auto-update profiling library."
LICENSE = "MIT"

PV = "0.2.6"

RPM_NAME = "ghc-auto-update-prof-0.2.6-1.15.aarch64.rpm"
RPM_HASH = "ad177919d024500f8fddc52122c3e35ca434a9eacaf616e8aba8680103e0da58b4e88145ef7b72b33407c25c77e36047973ba10103a263ae977208fa2050c9c8"

RPROVIDES:${PN} += "ghc-auto-update-prof \
ghc-prof-auto-update-0.2.6-2tH9dVxiiOkBVROYgrOYPc"

RDEPENDS:${PN} += "ghc-auto-update-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-stm-2.5.3.1-6d74"

inherit rpm
