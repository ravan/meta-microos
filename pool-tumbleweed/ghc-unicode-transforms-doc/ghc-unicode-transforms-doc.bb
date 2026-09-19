SUMMARY = "Haskell unicode-transforms library documentation"
DESCRIPTION = "This package provides the Haskell unicode-transforms library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-unicode-transforms-doc-0.4.0.1-10.3.noarch.rpm"
RPM_HASH = "1f6e3a36eb55e5f9c9079dee6a964b81d9645ad9f47b205cd76ed9d6e28cd7b0e70319bbeb4537558837fe64d599d0e7200ed6e4d7d1b10bcf4b18361399e2bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unicode-transforms-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
