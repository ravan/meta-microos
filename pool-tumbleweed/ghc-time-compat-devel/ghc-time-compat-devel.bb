SUMMARY = "Haskell time-compat library development files"
DESCRIPTION = "This package provides the Haskell time-compat library development files."
LICENSE = "BSD-3-Clause"

PV = "1.9.9"

RPM_NAME = "ghc-time-compat-devel-1.9.9-1.3.aarch64.rpm"
RPM_HASH = "e77f4946f1730fbba3996cbe7963aba66f0ba96187e6ff4b2a1bec2d30794a1df55957f0f05a892ba8dc1f3f4e648c1b13b1f3937736ba3e1d91a6fd9ac16354"

RPROVIDES:${PN} += "ghc-devel-time-compat-1.9.9-2vndaypoxzm5lJpcdxrQvS \
ghc-time-compat-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base-orphans-0.9.4-2vMgOxDXOniBrPCxqNGyGO \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-time-1.14-a7dc \
ghc-time-compat"

inherit rpm
