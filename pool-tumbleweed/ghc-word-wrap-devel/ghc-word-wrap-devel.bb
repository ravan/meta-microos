SUMMARY = "Haskell word-wrap library development files"
DESCRIPTION = "This package provides the Haskell word-wrap library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-word-wrap-devel-0.5-2.19.aarch64.rpm"
RPM_HASH = "0b330da04ffd8f5d1a2859e313f43e24f5d67fa0953ed1edef2c617ac461f5455b941924bdea05265f21e2bb1342de5e27d363623a400697d1d67176681b27e7"

RPROVIDES:${PN} += "ghc-devel-word-wrap-0.5-FAfG7XDOqTwGSwy25x3Nlx \
ghc-word-wrap-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-text-2.1.4-cf23 \
ghc-word-wrap"

inherit rpm
