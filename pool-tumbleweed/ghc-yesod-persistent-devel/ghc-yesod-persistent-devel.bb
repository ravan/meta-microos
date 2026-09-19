SUMMARY = "Haskell yesod-persistent library development files"
DESCRIPTION = "This package provides the Haskell yesod-persistent library development \
files."
LICENSE = "MIT"

PV = "1.6.0.9"

RPM_NAME = "ghc-yesod-persistent-devel-1.6.0.9-1.6.aarch64.rpm"
RPM_HASH = "1063fb9b02a66e7e28e679cf895245529e753230383b8281b949f0740cb3ca92da8cb3317fec35d9cc89a11000d363bf9c03f62c748f26922e6a8b08f5e43a16"

RPROVIDES:${PN} += "ghc-devel-yesod-persistent-1.6.0.9-HWNmgLBsD5B8eUWPPveJe \
ghc-yesod-persistent-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-blaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG \
ghc-devel-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-devel-persistent-2.17.1.0-4wNOAx2iKPh9qy3cL3mEtA \
ghc-devel-resource-pool-0.5.0.1-CRHTi96cJqx7YSyfyqtukW \
ghc-devel-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-yesod-core-1.6.29.1-6DqdyPYDE9N9BEzGBhDP9D \
ghc-yesod-persistent"

inherit rpm
