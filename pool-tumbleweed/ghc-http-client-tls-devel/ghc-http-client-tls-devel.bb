SUMMARY = "Haskell http-client-tls library development files"
DESCRIPTION = "This package provides the Haskell http-client-tls library development \
files."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "ghc-http-client-tls-devel-0.4.0-1.4.aarch64.rpm"
RPM_HASH = "c179da798fe582096fee9108bbb19eb3e75fa4a92acaa445dc4f104d05be9e7bee6f3ebe4b62fc0cbf10c03b599bf01760a6ab37f96d67a974c8a89f307adf97"

RPROVIDES:${PN} += "ghc-devel-http-client-tls-0.4.0-D4cx6zdDU3O6iLaLdAAVnV \
ghc-http-client-tls-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base16-1.0-GqCyVT5DfwtBcN8MC2i0Li \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-cryptohash-md5-0.11.101.0-BL71FgcwkvtHLdWrK6WsDS \
ghc-devel-crypton-connection-0.4.6-EpYbEhgynWEHAydR26M0y \
ghc-devel-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-http-client-0.7.19-4BIOUl8FXXcE32miDzHR9M \
ghc-devel-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-devel-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8 \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-tls-2.4.3-9EoJ6T6XUplFSFHrhcQuuh \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-http-client-tls"

inherit rpm
