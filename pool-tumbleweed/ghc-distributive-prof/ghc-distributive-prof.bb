SUMMARY = "Haskell distributive profiling library"
DESCRIPTION = "This package provides the Haskell distributive profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.6.3"

RPM_NAME = "ghc-distributive-prof-0.6.3-1.3.aarch64.rpm"
RPM_HASH = "3a8f1f7d05a95ca90eae1fd5048547a5067df25871b57dfe03440377a2a91def695412cb5a53a33048ca6025edfae79d9662fc41af705b02ef30e50b0fc3aeb6"

RPROVIDES:${PN} += "ghc-distributive-prof \
ghc-prof-distributive-0.6.3-9lg1Hxwh2KlJVxh3zQCgyL"

RDEPENDS:${PN} += "ghc-distributive-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
