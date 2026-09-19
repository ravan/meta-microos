SUMMARY = "Haskell crypton-pem library documentation"
DESCRIPTION = "This package provides the Haskell crypton-pem library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "ghc-crypton-pem-doc-0.3.0-1.3.noarch.rpm"
RPM_HASH = "9c9fd65cb351c0f75aba2634de22e803512998fe1538d77e3a308df791c084cca7b2fc8e72d4a71b5392d53b0074d28d2c8a5148c17f800a49723666f16077ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-crypton-pem-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
