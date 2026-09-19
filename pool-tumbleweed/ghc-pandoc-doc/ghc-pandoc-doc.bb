SUMMARY = "Haskell pandoc library documentation"
DESCRIPTION = "This package provides the Haskell pandoc library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "3.10"

RPM_NAME = "ghc-pandoc-doc-3.10-1.5.noarch.rpm"
RPM_HASH = "87f9a99dace90b5349208fc9a4cba14bb5adb64787bc69d0e806ac951b20f62e6d606cfbf423ed760b098a6ed367c8c69b8999b6c2453c23746c511e14ca79cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
