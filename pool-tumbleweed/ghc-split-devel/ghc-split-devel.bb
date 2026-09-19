SUMMARY = "Haskell split library development files"
DESCRIPTION = "This package provides the Haskell split library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.5"

RPM_NAME = "ghc-split-devel-0.2.5-1.16.aarch64.rpm"
RPM_HASH = "d4050b6e9e6963db39b7ebbad8c630130c58e7b66b108aaa05a58e7d6712f3b566c448dd126e20d03499aa6533fa8fc038e2a819a4a16e352a0eebe6c550a478"

RPROVIDES:${PN} += "ghc-devel-split-0.2.5-DF0qBqNymX3Hv5Ta0307xc \
ghc-split-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-split"

inherit rpm
