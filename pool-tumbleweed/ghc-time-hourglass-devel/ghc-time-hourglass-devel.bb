SUMMARY = "Haskell time-hourglass library development files"
DESCRIPTION = "This package provides the Haskell time-hourglass library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "ghc-time-hourglass-devel-0.3.0-1.3.aarch64.rpm"
RPM_HASH = "58a599d14e4671f9b2fabdf1d2416fabb9b4ea407fa4252cb5a178349b43d641b541db230e8063bcafe097306c7b38f6c2db4c515c5ae3f6ec7d3f9f773ecfec"

RPROVIDES:${PN} += "ghc-devel-time-hourglass-0.3.0-3eH7mx2lN21L13Pl8jWv6l \
ghc-time-hourglass-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-time-hourglass"

inherit rpm
