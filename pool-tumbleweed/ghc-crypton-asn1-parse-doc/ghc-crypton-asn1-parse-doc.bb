SUMMARY = "Haskell crypton-asn1-parse library documentation"
DESCRIPTION = "This package provides the Haskell crypton-asn1-parse library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "ghc-crypton-asn1-parse-doc-0.10.0-1.2.noarch.rpm"
RPM_HASH = "37ef3a8c7e62af8e12d62c16167ee819c01b375eaeda3ea0ebf4ec3aa351407252b9f47d2b149e8d1eea72a666c25a9495d7c1b8a7bde85ac8b8b309a66c7cf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-crypton-asn1-parse-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
