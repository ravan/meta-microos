SUMMARY = "Haskell yaml library documentation"
DESCRIPTION = "This package provides the Haskell yaml library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11.11.2"

RPM_NAME = "ghc-yaml-doc-0.11.11.2-3.23.noarch.rpm"
RPM_HASH = "0857ee1b643c5f7fce0756eea38e0a7d5746fe9e013526af6162fdee842796e3197714e8b05e6d7cf0ba3b25b563103209f8e6094330d6d0d2f57b465e289703"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yaml-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
