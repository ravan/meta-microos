SUMMARY = "Haskell hslua-cli library documentation"
DESCRIPTION = "This package provides the Haskell hslua-cli library documentation."
LICENSE = "MIT"

PV = "1.4.4"

RPM_NAME = "ghc-hslua-cli-doc-1.4.4-1.3.noarch.rpm"
RPM_HASH = "707beb6e40184bd6abfc1644acc7c653c63e01ba272c081a897252544a5fa709a2ea676cf37ba0653eea36d93e0fd0c1f4afcae1544db1b4b70327b87fe10412"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-cli-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
