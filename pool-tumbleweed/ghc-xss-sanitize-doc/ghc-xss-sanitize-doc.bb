SUMMARY = "Haskell xss-sanitize library documentation"
DESCRIPTION = "This package provides the Haskell xss-sanitize library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.3.7.2"

RPM_NAME = "ghc-xss-sanitize-doc-0.3.7.2-2.36.noarch.rpm"
RPM_HASH = "1d32a5ed249a8770c91dff6bb486e2261f31bbdfa3fdea920a5d0e51c49a5070f8a41cab2947b2fbe0fde77f7ad1bc3aab6ffe381bdbe6eefbc40a714989f5da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xss-sanitize-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
