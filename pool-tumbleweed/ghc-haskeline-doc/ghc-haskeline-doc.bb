SUMMARY = "Haskell haskeline library documentation"
DESCRIPTION = "This package provides the Haskell haskeline library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.4.1"

RPM_NAME = "ghc-haskeline-doc-0.8.4.1-1.3.noarch.rpm"
RPM_HASH = "f9d0522ece6963c7eaa934713fc28f383cc37d0e086d01fbe7a349bb58578e2f3291f594049dae7f60b2eb6b127c75d2896c5445b15185d915896b7927dcb0d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-haskeline-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
