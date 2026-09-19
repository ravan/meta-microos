SUMMARY = "Haskell time-manager profiling library"
DESCRIPTION = "This package provides the Haskell time-manager profiling library."
LICENSE = "MIT"

PV = "0.2.4"

RPM_NAME = "ghc-time-manager-prof-0.2.4-1.7.aarch64.rpm"
RPM_HASH = "64f04cd37e83e47ee297b43d730fedde9c62edd2ec5e5eaadcdb0fbbe9c1c9b4fe6ea6a85f07f399b18e712f7e334493dbe2bdf3f5adcc375ba87ae4237dbc2e"

RPROVIDES:${PN} += "ghc-prof-time-manager-0.2.4-H8vBuVTBThX7XPtYuadAK4 \
ghc-time-manager-prof"

RDEPENDS:${PN} += "ghc-prof-auto-update-0.2.6-2tH9dVxiiOkBVROYgrOYPc \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-time-manager-devel"

inherit rpm
