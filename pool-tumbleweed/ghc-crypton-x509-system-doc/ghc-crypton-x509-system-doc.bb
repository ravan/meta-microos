SUMMARY = "Haskell crypton-x509-system library documentation"
DESCRIPTION = "This package provides the Haskell crypton-x509-system library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.9.0"

RPM_NAME = "ghc-crypton-x509-system-doc-1.9.0-1.3.noarch.rpm"
RPM_HASH = "20b341a278f13679efa9c2dff8a1a32c395e6b619c1c16f72dc5adaa7714dbdc690c4bbea02831736d48d1deea697e32009b48292debcf4edbcd853e7a967e17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-crypton-x509-system-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
