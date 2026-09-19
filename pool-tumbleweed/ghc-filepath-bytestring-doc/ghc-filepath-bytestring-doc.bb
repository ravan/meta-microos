SUMMARY = "Haskell filepath-bytestring library documentation"
DESCRIPTION = "This package provides the Haskell filepath-bytestring library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.5.2.0.5"

RPM_NAME = "ghc-filepath-bytestring-doc-1.5.2.0.5-1.3.noarch.rpm"
RPM_HASH = "3a6824fdd1df9ce3415201026fdbe219a789ce3fc1d07ced925fb408f9327663bda28655511800c56a1a522d8a916314d8f7765b6014f011b0f944c022de150f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-filepath-bytestring-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
