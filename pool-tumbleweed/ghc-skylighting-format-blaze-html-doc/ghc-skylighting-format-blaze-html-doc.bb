SUMMARY = "Haskell skylighting-format-blaze-html library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-format-blaze-html library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-skylighting-format-blaze-html-doc-0.1.2-1.3.noarch.rpm"
RPM_HASH = "905f25fbfe08b6c39696a5e256ba2922fcc8ce99b77ab6b430fcc19d26af93a172d779b005c9ff2a658f7fa4a3f7c6d22ccfe3b177f70bff18503bb5a5fef92e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-format-blaze-html-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
