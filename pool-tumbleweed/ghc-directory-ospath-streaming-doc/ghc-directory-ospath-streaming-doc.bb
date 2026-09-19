SUMMARY = "Haskell directory-ospath-streaming library documentation"
DESCRIPTION = "This package provides the Haskell directory-ospath-streaming library documentation."
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "ghc-directory-ospath-streaming-doc-0.2.2-2.11.noarch.rpm"
RPM_HASH = "8a1097d029945dc095853bc35c452ead23645122e11c696ad16eb5490f83572b0c44fa46f21870d660748f7cf5774691ab742edb81b75c0a72169faf257e5bf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-directory-ospath-streaming-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
