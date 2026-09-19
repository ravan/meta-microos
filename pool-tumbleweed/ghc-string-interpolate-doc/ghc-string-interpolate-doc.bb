SUMMARY = "Haskell string-interpolate library documentation"
DESCRIPTION = "This package provides the Haskell string-interpolate library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.4.0"

RPM_NAME = "ghc-string-interpolate-doc-0.3.4.0-5.2.noarch.rpm"
RPM_HASH = "fdddb214caa61af033f5127ffa71a572443a6c7ea6da747fe8ac7666b5a54452c0f34773f882652778d4665fc389728c8b52d791b9e93880e5da72fae1e5768d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-string-interpolate-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
