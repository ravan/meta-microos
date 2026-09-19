SUMMARY = "Haskell asciidoc library documentation"
DESCRIPTION = "This package provides the Haskell asciidoc library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.3"

RPM_NAME = "ghc-asciidoc-doc-0.1.0.3-1.3.noarch.rpm"
RPM_HASH = "981c526f3493607ebb4d19d3a4342180480a60f43ed777559906d20dc2351845a5fc06df316d4f81be237fd5bcda071d6abf0058d23f537fa831d563416aa5a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-asciidoc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
