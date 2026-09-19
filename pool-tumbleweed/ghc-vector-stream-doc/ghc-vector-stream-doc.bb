SUMMARY = "Haskell vector-stream library documentation"
DESCRIPTION = "This package provides the Haskell vector-stream library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.1"

RPM_NAME = "ghc-vector-stream-doc-0.1.0.1-5.9.noarch.rpm"
RPM_HASH = "369786bac9d6017fd497ec74a16572191674f7c9e85fac7918dea98638e1f48607adb4eca030d934a58886d10cee5f131d2ac3692e3163d62025e47120ca605a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-vector-stream-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
