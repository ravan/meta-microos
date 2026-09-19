SUMMARY = "Haskell stm-chans library development files"
DESCRIPTION = "This package provides the Haskell stm-chans library development files."
LICENSE = "BSD-3-Clause"

PV = "3.0.0.11"

RPM_NAME = "ghc-stm-chans-devel-3.0.0.11-1.3.aarch64.rpm"
RPM_HASH = "644adca167dc8e3a4aa10d113feae27b4265dfac8638e7e7af722eb3e8d9cc1f0e6d0ee9d314152bf8ee0daa1c30d2556f9ecc3891c1bacbdc073446148b1e28"

RPROVIDES:${PN} += "ghc-devel-stm-chans-3.0.0.11-JJwEZlsv6s72G5B5FYXgFK \
ghc-stm-chans-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-stm-chans"

inherit rpm
