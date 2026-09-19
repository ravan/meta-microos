SUMMARY = "Haskell hledger-lib library documentation"
DESCRIPTION = "This package provides the Haskell hledger-lib library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "1.52.1"

RPM_NAME = "ghc-hledger-lib-doc-1.52.1-1.4.noarch.rpm"
RPM_HASH = "3ae7aa98f5cad4ae137a1cb0bc5f3751873bd71f7eceef2e5de38952e9545330a7655b7fec4ef785b17204f2afa299309c8c44000833c3f99874d02e4b941603"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hledger-lib-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
