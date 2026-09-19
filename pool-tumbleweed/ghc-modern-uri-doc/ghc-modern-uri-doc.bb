SUMMARY = "Haskell modern-uri library documentation"
DESCRIPTION = "This package provides the Haskell modern-uri library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.6.1"

RPM_NAME = "ghc-modern-uri-doc-0.3.6.1-3.3.noarch.rpm"
RPM_HASH = "d3d8d8395a642d8638d28c14f8bb2aef3d8dec8af31b892a9439130e50ea88bc3157d057ec7b0db68c201c28e237a28d249559afb749d0e8ef1d45ce5e11e986"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-modern-uri-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
