SUMMARY = "Haskell uniplate library documentation"
DESCRIPTION = "This package provides the Haskell uniplate library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6.13"

RPM_NAME = "ghc-uniplate-doc-1.6.13-4.44.noarch.rpm"
RPM_HASH = "d3af4dc069cd298cb587afbb251d329f45788df3b2e46d5ef19d9f322d8c6bd198c5c07626d6a5b74e0148cc7c7e9e0712d1d8b7a2a5609c25db13c0106307ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-uniplate-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
