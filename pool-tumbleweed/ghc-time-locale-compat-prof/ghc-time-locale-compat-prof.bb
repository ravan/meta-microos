SUMMARY = "Haskell time-locale-compat profiling library"
DESCRIPTION = "This package provides the Haskell time-locale-compat profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.5"

RPM_NAME = "ghc-time-locale-compat-prof-0.1.1.5-7.23.aarch64.rpm"
RPM_HASH = "f69fcf716496535cac947caabff12696f2e5babb5b27f219ff0d6436ed1b11993ea078098b4714653fc1c5d08aaf02cd07a9302f5e8950acdef92882c9bb7db8"

RPROVIDES:${PN} += "ghc-prof-time-locale-compat-0.1.1.5-9vdyA9EPu1IDeF7oXoCWqM \
ghc-time-locale-compat-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-time-1.14-a7dc \
ghc-time-locale-compat-devel"

inherit rpm
