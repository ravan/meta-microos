SUMMARY = "Haskell vector library documentation"
DESCRIPTION = "This package provides the Haskell vector library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.13.2.0"

RPM_NAME = "ghc-vector-doc-0.13.2.0-5.3.noarch.rpm"
RPM_HASH = "a542bee214d39dd936e9aaec8af49fcc57fd86930b6fc3b22b994e3193a0595cd030072785cee8d94e42e8663cf8fe50a2a4e5d90f518d40e6e3e0da57ba3036"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-vector-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
