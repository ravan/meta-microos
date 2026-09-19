SUMMARY = "Haskell clientsession profiling library"
DESCRIPTION = "This package provides the Haskell clientsession profiling library."
LICENSE = "MIT"

PV = "0.9.3.0"

RPM_NAME = "ghc-clientsession-prof-0.9.3.0-1.24.aarch64.rpm"
RPM_HASH = "cc62f30563df637c3b053ffc6ec837eb0cc09662c17153b1bb5b6fe6c064f1fe0ae991b4a8a1005dc3e216b881babd0efbc3c9059a171fdf920e8e019ba8a92c"

RPROVIDES:${PN} += "ghc-clientsession-prof \
ghc-prof-clientsession-0.9.3.0-JpU1pAihQU34992h3KLc2j"

RDEPENDS:${PN} += "ghc-clientsession-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-cereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww \
ghc-prof-crypto-api-0.13.3-BvysNl9crxvRkhKzviyjB \
ghc-prof-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-entropy-0.4.1.11-4UsuhibEvcjLW75DCXDx9X \
ghc-prof-setenv-0.1.1.3-DGkCIo7XRqzD68Dz6COumh \
ghc-prof-skein-1.0.9.4-1EnnjgQJNmMDn7VwfDrKcW \
ghc-prof-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7"

inherit rpm
