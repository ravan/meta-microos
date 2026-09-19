SUMMARY = "Haskell torrent library documentation"
DESCRIPTION = "This package provides the Haskell torrent library documentation."
LICENSE = "BSD-3-Clause"

PV = "10000.1.3"

RPM_NAME = "ghc-torrent-doc-10000.1.3-1.32.noarch.rpm"
RPM_HASH = "32e87c62ecf562537891fde161561a6b52b76f9ffbeffd7adf90a407ac107356e9bcee5914bf7fe2af2928936e7f53d966ab831fdec297528571869ef9d181ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-torrent-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
