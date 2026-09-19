SUMMARY = "Haskell cassava-megaparsec library documentation"
DESCRIPTION = "This package provides the Haskell cassava-megaparsec library documentation."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "ghc-cassava-megaparsec-doc-2.1.1-1.21.noarch.rpm"
RPM_HASH = "7a6573ea68b67b7c6baf116e5b0de9af5da95165864385a6b39624c1a6354a8ea9ed2720a1b3e199ea59a0584d6f6934ac7b3fdf858e238a95e123be1f417ae0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cassava-megaparsec-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
