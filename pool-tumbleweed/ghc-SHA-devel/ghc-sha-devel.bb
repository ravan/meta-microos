SUMMARY = "Haskell SHA library development files"
DESCRIPTION = "This package provides the Haskell SHA library development files."
LICENSE = "BSD-3-Clause"

PV = "1.6.4.4"

RPM_NAME = "ghc-SHA-devel-1.6.4.4-8.23.aarch64.rpm"
RPM_HASH = "494426d088d97251c92bba83b96650e9609fca169b88a89448f939500a9427ddeecb28a3dbd889119350b5762bfb8bb2f74ddaa30b4ce1a6012f0fe09b8dc526"

RPROVIDES:${PN} += "ghc-SHA-devel \
ghc-devel-SHA-1.6.4.4-F68cMQUf1qw5myCdTNffCM"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-SHA \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-bytestring-0.12.2.0-65be"

inherit rpm
