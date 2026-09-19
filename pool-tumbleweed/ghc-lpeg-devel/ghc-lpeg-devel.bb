SUMMARY = "Haskell lpeg library development files"
DESCRIPTION = "This package provides the Haskell lpeg library development files."
LICENSE = "MIT"

PV = "1.1.0.1"

RPM_NAME = "ghc-lpeg-devel-1.1.0.1-1.3.aarch64.rpm"
RPM_HASH = "04a5125ef418e9a5beea7549cac27b6cc7ca5aceff19aa683c14796114e64987745686cbe3b1697259f63519ecdde30233c4e55e82e08c353ea77d066f37f019"

RPROVIDES:${PN} += "ghc-devel-lpeg-1.1.0.1-Jbb90xEfizAEuGHvVCZgbp \
ghc-lpeg-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-lua-2.3.4-GxTlN73bN8C8KbBhVEtsew \
ghc-lpeg"

inherit rpm
