SUMMARY = "Haskell vector-algorithms library documentation"
DESCRIPTION = "This package provides the Haskell vector-algorithms library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.9.1.0"

RPM_NAME = "ghc-vector-algorithms-doc-0.9.1.0-2.3.noarch.rpm"
RPM_HASH = "63fd99fc03717a21093b6bfa20170f6daad806004a4a35c9f5844752a4b85b791ba90141548f1b98fb26e564fe6521f6386057ce4aa973c9e3c32a5e62ea2067"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-vector-algorithms-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
