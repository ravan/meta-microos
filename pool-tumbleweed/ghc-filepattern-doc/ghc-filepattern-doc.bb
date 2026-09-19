SUMMARY = "Haskell filepattern library documentation"
DESCRIPTION = "This package provides the Haskell filepattern library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-filepattern-doc-0.1.3-2.36.noarch.rpm"
RPM_HASH = "575c6378b3c09a551474628d497a5a9478b7ac163cf8534fdb44e9ea72a3976fcf33732eb99db500b37739a3f10057a8395a8562c49b19ec006a4c854060f73e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-filepattern-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
