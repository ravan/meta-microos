SUMMARY = "Haskell skylighting-core library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-core library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.14.7"

RPM_NAME = "ghc-skylighting-core-doc-0.14.7-1.13.noarch.rpm"
RPM_HASH = "79c8984a56041e2e0197c93dd505f0fe4ff96516adc5155bd8fb4bebd9a55e75068607bce2e9b848e97fd1235a97ddf32db6ae33b729e911deabef043694cd30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
