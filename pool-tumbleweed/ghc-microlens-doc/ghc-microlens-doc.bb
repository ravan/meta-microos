SUMMARY = "Haskell microlens library documentation"
DESCRIPTION = "This package provides the Haskell microlens library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.0"

RPM_NAME = "ghc-microlens-doc-0.5.0.0-1.9.noarch.rpm"
RPM_HASH = "45ac6f8fdb37a5004bd83ae4b8e9aa8c438d357ebab998d4bae54f1a43586a2fc43035ed87821617f4a997322616767946951c197a7266981765df19841b346a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-microlens-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
