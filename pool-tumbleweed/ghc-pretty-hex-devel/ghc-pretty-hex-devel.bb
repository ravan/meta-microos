SUMMARY = "Haskell pretty-hex library development files"
DESCRIPTION = "This package provides the Haskell pretty-hex library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-pretty-hex-devel-1.1-4.19.aarch64.rpm"
RPM_HASH = "a26ccb2400bfe9221fa2e243df9927a7c178f55cb41c1003f3693be1da074ad0298a878e11a05479e07c005654f6119de210aef2d6958dd63a97c3384f61b6b9"

RPROVIDES:${PN} += "ghc-devel-pretty-hex-1.1-9KkuISSwhPFByR4xDG3StA \
ghc-pretty-hex-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-pretty-hex"

inherit rpm
