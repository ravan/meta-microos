SUMMARY = "Haskell refact library documentation"
DESCRIPTION = "This package provides the Haskell refact library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.0.2"

RPM_NAME = "ghc-refact-doc-0.3.0.2-4.19.noarch.rpm"
RPM_HASH = "63a9a251511b417db822ef2dad3502f3c673fc91d62c8594f535008d6e6f883da91d53709b4d77f6e892b4629fe2c9668cbae13895dee82a986a82f93205c995"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-refact-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
