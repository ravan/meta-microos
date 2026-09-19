SUMMARY = "Haskell th-abstraction library documentation"
DESCRIPTION = "This package provides the Haskell th-abstraction library documentation."
LICENSE = "ISC"

PV = "0.7.2.0"

RPM_NAME = "ghc-th-abstraction-doc-0.7.2.0-1.3.noarch.rpm"
RPM_HASH = "cf9e3290f57fc2c8e85d85906d2be7fa2b1bc48ed5fb166ceb063b04f5a2734ee7f70a52e3b6106f0ee24b1b14a506b70b526ceffab536e6277c572bf30744af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-th-abstraction-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
