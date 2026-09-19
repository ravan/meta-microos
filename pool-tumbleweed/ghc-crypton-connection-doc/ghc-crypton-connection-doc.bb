SUMMARY = "Haskell crypton-connection library documentation"
DESCRIPTION = "This package provides the Haskell crypton-connection library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.6"

RPM_NAME = "ghc-crypton-connection-doc-0.4.6-1.3.noarch.rpm"
RPM_HASH = "771b8c4990c4b05d932f7e41add261715fcabd96256b3924ed992b52f1200fbc06c23ee8dd0a4dc0cc168d3ea8f4bb8e08fa5bf387cca58bb92773208a92eaa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-crypton-connection-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
