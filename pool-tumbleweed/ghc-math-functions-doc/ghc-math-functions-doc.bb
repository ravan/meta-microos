SUMMARY = "Haskell math-functions library documentation"
DESCRIPTION = "This package provides the Haskell math-functions library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.3.4.4"

RPM_NAME = "ghc-math-functions-doc-0.3.4.4-1.35.noarch.rpm"
RPM_HASH = "b4c75fa8abf24c276ae84f3f1d7823eeb4f2e94a2040c5a1d18d9cacd8d3c282711a22b1f6fc0b0c49a4ea4d5dee70fe148b62ce6f8df5ee4d425e3ac86fb1d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-math-functions-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
