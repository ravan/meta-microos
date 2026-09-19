SUMMARY = "Haskell hslua-packaging library documentation"
DESCRIPTION = "This package provides the Haskell hslua-packaging library documentation."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "ghc-hslua-packaging-doc-2.4.1-1.2.noarch.rpm"
RPM_HASH = "77b7c853e3d1cf3d42e3ed625679db6e3c55f6ee23984120db13be153665a29f87dc76d7c331186e141e0fc7c952598edef597351ff8865d58eeb0cc06bb71d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-packaging-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
