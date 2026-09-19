SUMMARY = "Haskell skylighting-format-ansi library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-format-ansi library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-ansi-doc-0.1-2.80.noarch.rpm"
RPM_HASH = "f045069d9de7792a0113a4e1a515647a57682605a61d579e0fbd1ed42b233206ec14b25c0a4129a81145c063340226f08f6b1d9779eeb67d54953990a52b2e9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-format-ansi-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
