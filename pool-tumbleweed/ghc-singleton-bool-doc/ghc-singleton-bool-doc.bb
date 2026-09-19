SUMMARY = "Haskell singleton-bool library documentation"
DESCRIPTION = "This package provides the Haskell singleton-bool library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "ghc-singleton-bool-doc-0.1.8-3.2.noarch.rpm"
RPM_HASH = "f33cbe2319919774342d2e4aee8088f771f7f261c1034e813521f70148615a42aeb6bfa51e27db906ed3088db52a6a7451dbe4f9dc6e8fd3a78b4de6b6a02c10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-singleton-bool-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
