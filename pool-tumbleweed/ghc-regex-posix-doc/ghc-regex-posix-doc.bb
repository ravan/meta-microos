SUMMARY = "Haskell regex-posix library documentation"
DESCRIPTION = "This package provides the Haskell regex-posix library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.96.0.2"

RPM_NAME = "ghc-regex-posix-doc-0.96.0.2-1.12.noarch.rpm"
RPM_HASH = "54174bde2c7b2221e53cabb9f6464e496b0b76f7eefcb1632bc6cf207d70027c8c85cfe9a06c2f535284a8dabc5a68a0d89482e33432243f95828955240b11cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-regex-posix-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
