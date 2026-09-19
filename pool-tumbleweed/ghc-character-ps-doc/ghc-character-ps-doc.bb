SUMMARY = "Haskell character-ps library documentation"
DESCRIPTION = "This package provides the Haskell character-ps library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-character-ps-doc-0.1-1.17.noarch.rpm"
RPM_HASH = "0eec4e1a33b686071f8bff986752e61f4d2d0c1bcee827e4ef902eeb92e7b27fcc751b87ed049e3f0bf51fbac80cf79bb23848942e381781e66b250b17d41973"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-character-ps-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
