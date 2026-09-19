SUMMARY = "Haskell pandoc-lua-marshal library development files"
DESCRIPTION = "This package provides the Haskell pandoc-lua-marshal library development \
files."
LICENSE = "MIT"

PV = "0.3.2.1"

RPM_NAME = "ghc-pandoc-lua-marshal-devel-0.3.2.1-1.2.aarch64.rpm"
RPM_HASH = "4ca3d5f458fa72b84e0249c3c410ac890fcaba8d4361ec476994cd78aab1edcad13ea9a082559c4a5783a048b883121dabb531e6e12ee6b80888c6273d9f21bf"

RPROVIDES:${PN} += "ghc-devel-pandoc-lua-marshal-0.3.2.1-6Zh3k4Z7NDRLHwqWkKsbjS \
ghc-pandoc-lua-marshal-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-hslua-2.5.0-EJ5RjGxg4AI6GL8E9HKZKp \
ghc-devel-hslua-list-1.1.4-2iYtswPM1Oh6QVQjUY3AZP \
ghc-devel-hslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o \
ghc-devel-pandoc-types-1.23.1.2-ChVVUkZ84FqF7WWwilaI65 \
ghc-devel-safe-0.3.21-AzRUUYeJ47sQc55olWnva \
ghc-devel-text-2.1.4-cf23 \
ghc-pandoc-lua-marshal"

inherit rpm
