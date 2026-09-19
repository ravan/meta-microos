SUMMARY = "Haskell network-byte-order library documentation"
DESCRIPTION = "This package provides the Haskell network-byte-order library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "ghc-network-byte-order-doc-0.1.8-1.2.noarch.rpm"
RPM_HASH = "ddd61caf5c377891960d1fd813ab9e9d9e31db80c3f985c0891a0e7bc2b6daa0a99c3bae7d22e9229ca93eecf5e9354e1611aae22de5f87b6b242237d268b6b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-network-byte-order-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
