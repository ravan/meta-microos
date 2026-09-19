SUMMARY = "Haskell text-iso8601 library development files"
DESCRIPTION = "This package provides the Haskell text-iso8601 library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-text-iso8601-devel-0.1.1.1-1.3.aarch64.rpm"
RPM_HASH = "2bc252ba143e6c7cea809e60b91e46f6c37d916b81d1e4fdbc7fb38241727a0fe2a004e4319df0d0f503841d5977e5fdfca66f8a37a920d08172bea614970226"

RPROVIDES:${PN} += "ghc-devel-text-iso8601-0.1.1.1-6Bjz9eUSPP1K02pEWpeews \
ghc-text-iso8601-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-integer-conversion-0.1.1-HaWNFfmKaxu3271U3IJ8uO \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-time-1.14-a7dc \
ghc-devel-time-compat-1.9.9-2vndaypoxzm5lJpcdxrQvS \
ghc-text-iso8601"

inherit rpm
