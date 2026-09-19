SUMMARY = "Haskell fsnotify library documentation"
DESCRIPTION = "This package provides the Haskell fsnotify library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.4.0"

RPM_NAME = "ghc-fsnotify-doc-0.4.4.0-1.9.noarch.rpm"
RPM_HASH = "9859bb903dac229ccfbc0ca2d5da533627167a122da64d67ad85a70fe543dd1d82ad0220c092f03e3ae14677c20460088c97f1b143a46eb344c8c2639c07b154"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-fsnotify-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
