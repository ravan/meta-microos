SUMMARY = "Haskell colour library documentation"
DESCRIPTION = "This package provides the Haskell colour library documentation."
LICENSE = "MIT"

PV = "2.3.7"

RPM_NAME = "ghc-colour-doc-2.3.7-1.2.noarch.rpm"
RPM_HASH = "e42cd37aef94e63ef26b3fec1c9892d38c683a0ec834277b1487770f9150dbfd8155942363f1bda8e022e2976670fdcd1a1cbfdc52a93e0c9a0ccad63ac2abf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-colour-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
