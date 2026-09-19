SUMMARY = "Haskell primitive library documentation"
DESCRIPTION = "This package provides the Haskell primitive library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.9.1.0"

RPM_NAME = "ghc-primitive-doc-0.9.1.0-2.3.noarch.rpm"
RPM_HASH = "f9e53337e20e98a6caa34db9c5f7decaa114ace596916f5af61bc1e1a9d4459d52ed492f1b354e99ef4368292cfbbf7c8c2cc4f1d961d1c6e23b30b4e66809d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-primitive-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
