SUMMARY = "Haskell pandoc-lua-marshal library documentation"
DESCRIPTION = "This package provides the Haskell pandoc-lua-marshal library documentation."
LICENSE = "MIT"

PV = "0.3.2.1"

RPM_NAME = "ghc-pandoc-lua-marshal-doc-0.3.2.1-1.2.noarch.rpm"
RPM_HASH = "56276c73d06bf60be7d6bd62110122b659a34d95edfe527415d7ce84d57d44f71ad88a25ce5c890b1147a7c53c5ff71de62f857c191cc3c9f2255597955507bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-lua-marshal-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
