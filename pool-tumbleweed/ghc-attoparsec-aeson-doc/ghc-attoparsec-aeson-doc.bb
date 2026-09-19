SUMMARY = "Haskell attoparsec-aeson library documentation"
DESCRIPTION = "This package provides the Haskell attoparsec-aeson library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.2.2.0"

RPM_NAME = "ghc-attoparsec-aeson-doc-2.2.2.0-2.3.noarch.rpm"
RPM_HASH = "fb16cd556ce3c264eaad89cd5c644432b10eaaa75cc896de91fd2f06bac6ade385525089e5b212b78e5bbc8f270f812f066d48fdcb2d0db06e9302f4626ace31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-attoparsec-aeson-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
