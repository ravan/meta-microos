SUMMARY = "Haskell base library documentation"
DESCRIPTION = "This package provides the Haskell base library documentation."
LICENSE = "BSD-3-Clause"

PV = "4.21.2.0"

RPM_NAME = "ghc-base-doc-4.21.2.0-1.3.noarch.rpm"
RPM_HASH = "14d76d56bf82fe4747d32515599ab0b5448292084fc91a3948e5de675f85cae8c645aa4a58a79a118e47db8f03e0390fe8c701ff0dba587a7c0151e3de3a672b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
