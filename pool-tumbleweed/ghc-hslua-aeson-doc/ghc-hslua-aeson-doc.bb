SUMMARY = "Haskell hslua-aeson library documentation"
DESCRIPTION = "This package provides the Haskell hslua-aeson library documentation."
LICENSE = "MIT"

PV = "2.3.2"

RPM_NAME = "ghc-hslua-aeson-doc-2.3.2-1.2.noarch.rpm"
RPM_HASH = "60468a08142426e37b128c709cac3f9fc533140f97ae3ad5bde15bd0f9cc94136ab6f621c270581412898a866ecd4469b2e6053df62a52bd785a21d48f6b954c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-aeson-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
