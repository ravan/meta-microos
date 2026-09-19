SUMMARY = "Haskell concurrent-output library documentation"
DESCRIPTION = "This package provides the Haskell concurrent-output library documentation."
LICENSE = "BSD-2-Clause"

PV = "1.10.21"

RPM_NAME = "ghc-concurrent-output-doc-1.10.21-1.29.noarch.rpm"
RPM_HASH = "22f2f790a3294fadb0045cd56244c7b11ff528bf295ea00e9b8ffbc78f3c1cfb745c4b633fa51fdf57d0efdd772aa00f6473b387987dafdce81c1c7364f9df10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-concurrent-output-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
