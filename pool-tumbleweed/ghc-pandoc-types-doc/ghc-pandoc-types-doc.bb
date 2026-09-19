SUMMARY = "Haskell pandoc-types library documentation"
DESCRIPTION = "This package provides the Haskell pandoc-types library documentation."
LICENSE = "GPL-2.0-only"

PV = "1.23.1.2"

RPM_NAME = "ghc-pandoc-types-doc-1.23.1.2-1.3.noarch.rpm"
RPM_HASH = "179a21a86a18b7497c91fddb5588f007100c63b3825032871d212696e3e450b9de54a910b1f8e2b24fb950216a99caf592c5563a25daf06bc267c0e8f4c96abe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-types-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
