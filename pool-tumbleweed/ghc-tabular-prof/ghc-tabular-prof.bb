SUMMARY = "Haskell tabular profiling library"
DESCRIPTION = "This package provides the Haskell tabular profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.8"

RPM_NAME = "ghc-tabular-prof-0.2.2.8-4.31.aarch64.rpm"
RPM_HASH = "f895a805747cb3a20bc3c43a221b9bb27c4cc3803ec8a0bd1d80d8c77dd7207138eb59c2baf708a087da2b9e88460dc6a2831e93bb44851b8ccd7c05760ae6eb"

RPROVIDES:${PN} += "ghc-prof-tabular-0.2.2.8-ICV0buHy8xI197ojnqVjgg \
ghc-tabular-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-csv-0.1.2-3wV9bBF7sWG7h8WLMiwYq8 \
ghc-prof-html-1.0.1.2-47pIZc0gzI25DOiguxUrYX \
ghc-prof-mtl-2.3.2-37ef \
ghc-tabular-devel"

inherit rpm
