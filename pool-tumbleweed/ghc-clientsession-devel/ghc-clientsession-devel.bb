SUMMARY = "Haskell clientsession library development files"
DESCRIPTION = "This package provides the Haskell clientsession library development files."
LICENSE = "MIT"

PV = "0.9.3.0"

RPM_NAME = "ghc-clientsession-devel-0.9.3.0-1.24.aarch64.rpm"
RPM_HASH = "b2bbc5772d68a5a880aa6e4b03cfdfb393c0e0f0eeba0cf679f48a17b8ea680463968ec8b0e09460d0179d843c2f378740960d39ad5daef3ae1f77501f92f0c2"

RPROVIDES:${PN} += "ghc-clientsession-devel \
ghc-devel-clientsession-0.9.3.0-JpU1pAihQU34992h3KLc2j"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-clientsession \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-cereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww \
ghc-devel-crypto-api-0.13.3-BvysNl9crxvRkhKzviyjB \
ghc-devel-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-entropy-0.4.1.11-4UsuhibEvcjLW75DCXDx9X \
ghc-devel-setenv-0.1.1.3-DGkCIo7XRqzD68Dz6COumh \
ghc-devel-skein-1.0.9.4-1EnnjgQJNmMDn7VwfDrKcW \
ghc-devel-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7"

inherit rpm
