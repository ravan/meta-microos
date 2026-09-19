SUMMARY = "Haskell http-client-restricted profiling library"
DESCRIPTION = "This package provides the Haskell http-client-restricted profiling library."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "ghc-http-client-restricted-prof-0.1.1-1.4.aarch64.rpm"
RPM_HASH = "86be82b72b5ae587177ff1c10f31f6a33af11680a891f0acb5d2ed99639a49710e1d14799d9c00ec5757700286d479f5a143bca3f2881a538a595a6ac6642ef7"

RPROVIDES:${PN} += "ghc-http-client-restricted-prof \
ghc-prof-http-client-restricted-0.1.1-6CI3ni80WE31wg508CrdwB"

RDEPENDS:${PN} += "ghc-http-client-restricted-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-crypton-connection-0.4.6-EpYbEhgynWEHAydR26M0y \
ghc-prof-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-prof-http-client-0.7.19-4BIOUl8FXXcE32miDzHR9M \
ghc-prof-http-client-tls-0.4.0-D4cx6zdDU3O6iLaLdAAVnV \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-prof-network-bsd-2.8.1.0-Eim1HbjRi8aBvcsvglmxNx \
ghc-prof-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG"

inherit rpm
