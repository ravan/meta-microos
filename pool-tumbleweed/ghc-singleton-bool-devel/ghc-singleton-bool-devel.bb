SUMMARY = "Haskell singleton-bool library development files"
DESCRIPTION = "This package provides the Haskell singleton-bool library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "ghc-singleton-bool-devel-0.1.8-3.2.aarch64.rpm"
RPM_HASH = "a68189aa360bfe87aa6ace5c6f930656c502f1bb4f4a19c881fc7362bad7df0e385816f9d8024cd735cbecdcf43967707f09b9a8c76559477c8ecb9ca9962e61"

RPROVIDES:${PN} += "ghc-devel-singleton-bool-0.1.8-HY7gfyx2MgbLc4ChWl2rDv \
ghc-singleton-bool-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-boring-0.2.2.1-8s8A4hTb7xgDndEEz6qoTw \
ghc-devel-dec-0.0.6-9n55jO9wFkCDcYlO4DYA9w \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-some-1.0.6-8u6QsVxyLEPKKVYkZL0j6j \
ghc-singleton-bool"

inherit rpm
