SUMMARY = "Haskell mlkem library documentation"
DESCRIPTION = "This package provides the Haskell mlkem library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.0"

RPM_NAME = "ghc-mlkem-doc-0.2.1.0-1.3.noarch.rpm"
RPM_HASH = "05ea6ae29122f27ea6f49a31e4ce9bcc69ab64d620168d7419521e64d68c6dc961c1a56d434d23c03e30501866f8f85e6d7e2581e7498d1d90ff23f7a9e291ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-mlkem-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
