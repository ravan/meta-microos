SUMMARY = "Haskell ipynb library documentation"
DESCRIPTION = "This package provides the Haskell ipynb library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "ghc-ipynb-doc-0.2-2.58.noarch.rpm"
RPM_HASH = "abb0c6c6181475f5b9d75ce8947dfe15dd5f18d66bd08a70d12b360458a69d49839baa2c85bc08a9774a8a95e403920ee536cd4b6a3c941a1d1184cdefdb2729"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ipynb-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
