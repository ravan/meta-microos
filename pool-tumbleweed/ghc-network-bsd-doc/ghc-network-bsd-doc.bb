SUMMARY = "Haskell network-bsd library documentation"
DESCRIPTION = "This package provides the Haskell network-bsd library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.8.1.0"

RPM_NAME = "ghc-network-bsd-doc-2.8.1.0-9.16.noarch.rpm"
RPM_HASH = "84285cc19067ea260947ffa7457fccdd08628a64faf181c324ec31760b8f7b244df50b181a54561a7d1f2f9fca08003fd5ba5a796c8051eea6d90be99a52354f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-network-bsd-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
