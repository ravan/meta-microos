SUMMARY = "Haskell pango library documentation"
DESCRIPTION = "This package provides the Haskell pango library documentation."
LICENSE = "LGPL-2.1-only"

PV = "0.13.12.0"

RPM_NAME = "ghc-pango-doc-0.13.12.0-1.12.noarch.rpm"
RPM_HASH = "b688436f58f87fa61f5d7c0763c42c4691493091cf4776dace8e566c523c8a5b67a498b16657a1ec7b790ae36d701506e45368d6c5ea9a7c21d5a8ee65194e84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pango-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
