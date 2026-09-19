SUMMARY = "Haskell psqueues library documentation"
DESCRIPTION = "This package provides the Haskell psqueues library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.8.3"

RPM_NAME = "ghc-psqueues-doc-0.2.8.3-2.3.noarch.rpm"
RPM_HASH = "7745c50ef21d665f87a81250ee032234ffffda98ce0674e937c175c7fdb81db33ddcdff4fc5943a55aced74a2e7eb1f73a396431168c34031ed28b7f55a49fc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-psqueues-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
