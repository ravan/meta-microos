SUMMARY = "Haskell skein library documentation"
DESCRIPTION = "This package provides the Haskell skein library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.9.4"

RPM_NAME = "ghc-skein-doc-1.0.9.4-4.26.noarch.rpm"
RPM_HASH = "a10b61856fc312fe1b4dff1c0e109a4aad0f8ab3fea35de44da544fd22b624f08c3ff4b70302ad8c3acfca7534b2d821658f6ea68b7755c62f9ea9ec6db3e5dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skein-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
