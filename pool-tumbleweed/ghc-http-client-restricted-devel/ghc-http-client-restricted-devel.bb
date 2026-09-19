SUMMARY = "Haskell http-client-restricted library development files"
DESCRIPTION = "This package provides the Haskell http-client-restricted library \
development files."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "ghc-http-client-restricted-devel-0.1.1-1.4.aarch64.rpm"
RPM_HASH = "9858dd32edb4c033c3353e8c2cf95e0bb12788c76844fc87597544fdcc333471b04333778be4d7bae3a6c2d71785f39052823f956e13ed21b95eed0e753a8c4f"

RPROVIDES:${PN} += "ghc-devel-http-client-restricted-0.1.1-6CI3ni80WE31wg508CrdwB \
ghc-http-client-restricted-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-crypton-connection-0.4.6-EpYbEhgynWEHAydR26M0y \
ghc-devel-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-devel-http-client-0.7.19-4BIOUl8FXXcE32miDzHR9M \
ghc-devel-http-client-tls-0.4.0-D4cx6zdDU3O6iLaLdAAVnV \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-devel-network-bsd-2.8.1.0-Eim1HbjRi8aBvcsvglmxNx \
ghc-devel-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-http-client-restricted"

inherit rpm
