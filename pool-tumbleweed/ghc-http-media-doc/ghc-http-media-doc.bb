SUMMARY = "Haskell http-media library documentation"
DESCRIPTION = "This package provides the Haskell http-media library documentation."
LICENSE = "MIT"

PV = "0.8.1.1"

RPM_NAME = "ghc-http-media-doc-0.8.1.1-3.21.noarch.rpm"
RPM_HASH = "f59d796c507b912c781da4e3204abd179c5c39e4802394f11e8b2e87607af61968038e1e1d2c09792bced0c7af7461dbe4e7f25b9ed22a23c92ebf89479a255a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-media-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
