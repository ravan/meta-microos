SUMMARY = "Haskell unicode-data library documentation"
DESCRIPTION = "This package provides the Haskell unicode-data library documentation."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "ghc-unicode-data-doc-0.6.0-1.16.noarch.rpm"
RPM_HASH = "5817809e8ca3151e45709e11bbf9b004d22ab742791e0b2aff0926f761ac112e08b628ca0ef0a31eb572ba26db0953882ccf0d2f329efdcc1c19b18b349c87f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unicode-data-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
