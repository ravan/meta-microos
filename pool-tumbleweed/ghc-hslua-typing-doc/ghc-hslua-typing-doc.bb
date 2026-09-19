SUMMARY = "Haskell hslua-typing library documentation"
DESCRIPTION = "This package provides the Haskell hslua-typing library documentation."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "ghc-hslua-typing-doc-0.2.0-1.2.noarch.rpm"
RPM_HASH = "fb44c42675503f1de9b6cac7a9f5ee9dacd3ba2ad8740b46f0efa855ac03838892b022be06d1c634575d5f6298a071f9d851794618c45709261249c3e46baff7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-typing-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
