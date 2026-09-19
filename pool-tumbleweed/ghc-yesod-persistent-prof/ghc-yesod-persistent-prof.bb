SUMMARY = "Haskell yesod-persistent profiling library"
DESCRIPTION = "This package provides the Haskell yesod-persistent profiling library."
LICENSE = "MIT"

PV = "1.6.0.9"

RPM_NAME = "ghc-yesod-persistent-prof-1.6.0.9-1.6.aarch64.rpm"
RPM_HASH = "aae8af96e51c6a206597a43acf88230e2bdcf829e1fc2820c6fec2b12d7953318d9e937d3cb65d20883e73e4fadcc93ac07768cba973659fa630b9b96d1484a9"

RPROVIDES:${PN} += "ghc-prof-yesod-persistent-1.6.0.9-HWNmgLBsD5B8eUWPPveJe \
ghc-yesod-persistent-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-blaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG \
ghc-prof-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-prof-persistent-2.17.1.0-4wNOAx2iKPh9qy3cL3mEtA \
ghc-prof-resource-pool-0.5.0.1-CRHTi96cJqx7YSyfyqtukW \
ghc-prof-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-yesod-core-1.6.29.1-6DqdyPYDE9N9BEzGBhDP9D \
ghc-yesod-persistent-devel"

inherit rpm
