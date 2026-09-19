SUMMARY = "Haskell commonmark library documentation"
DESCRIPTION = "This package provides the Haskell commonmark library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3"

RPM_NAME = "ghc-commonmark-doc-0.3-1.3.noarch.rpm"
RPM_HASH = "43fdf34b1ee4bb55996d8407a909622f842b148a071cfae22e6ad9013c62c75924db11ec26191fec1e493ca0740e1f9fcb9ceefa4afbb98572f23fc464495967"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-commonmark-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
