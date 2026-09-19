SUMMARY = "Haskell word-wrap library documentation"
DESCRIPTION = "This package provides the Haskell word-wrap library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-word-wrap-doc-0.5-2.19.noarch.rpm"
RPM_HASH = "ace33b2eb9142e0f80a8a9262138d0c99089d9137452ecb7d1c53ddce13185952bfbe2d2525a782ea9c6d68e78bbc14a78cacc7313d394ba5d6e94c35c3ae5ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-word-wrap-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
