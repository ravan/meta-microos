SUMMARY = "Haskell hslua library documentation"
DESCRIPTION = "This package provides the Haskell hslua library documentation."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "ghc-hslua-doc-2.5.0-1.2.noarch.rpm"
RPM_HASH = "da3183cb4719f52e3204645c76551ff66644b02dff454c0431af30fff42be9fb1aacc0e2f20ec713913ba71778010cbb03e9f7d2a1d673164489704bf0e84ffb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
