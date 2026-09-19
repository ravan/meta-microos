SUMMARY = "Haskell pandoc-lua-marshal profiling library"
DESCRIPTION = "This package provides the Haskell pandoc-lua-marshal profiling library."
LICENSE = "MIT"

PV = "0.3.2.1"

RPM_NAME = "ghc-pandoc-lua-marshal-prof-0.3.2.1-1.2.aarch64.rpm"
RPM_HASH = "e873f372e01f02ffd3b5219d6ff5d4fc55a3c49ba9dfce67e87c2a7eb7cf64b7a28dc9f0f660a374999fc4e055cef6a3151bd35120ccf662cf4b3483b387154d"

RPROVIDES:${PN} += "ghc-pandoc-lua-marshal-prof \
ghc-prof-pandoc-lua-marshal-0.3.2.1-6Zh3k4Z7NDRLHwqWkKsbjS"

RDEPENDS:${PN} += "ghc-pandoc-lua-marshal-devel \
ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-hslua-2.5.0-EJ5RjGxg4AI6GL8E9HKZKp \
ghc-prof-hslua-list-1.1.4-2iYtswPM1Oh6QVQjUY3AZP \
ghc-prof-hslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o \
ghc-prof-pandoc-types-1.23.1.2-ChVVUkZ84FqF7WWwilaI65 \
ghc-prof-safe-0.3.21-AzRUUYeJ47sQc55olWnva \
ghc-prof-text-2.1.4-cf23"

inherit rpm
