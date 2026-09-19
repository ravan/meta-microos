SUMMARY = "Haskell http-client-tls profiling library"
DESCRIPTION = "This package provides the Haskell http-client-tls profiling library."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "ghc-http-client-tls-prof-0.4.0-1.4.aarch64.rpm"
RPM_HASH = "04d6a57d24425ccdce789b1e14038c281f6bc26161e341cedf874f0c6cc6b7a82deaf854d1ea9629b0ed3b63934476289707828e0aaf49ce801b05457d921b6c"

RPROVIDES:${PN} += "ghc-http-client-tls-prof \
ghc-prof-http-client-tls-0.4.0-D4cx6zdDU3O6iLaLdAAVnV"

RDEPENDS:${PN} += "ghc-http-client-tls-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base16-1.0-GqCyVT5DfwtBcN8MC2i0Li \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-cryptohash-md5-0.11.101.0-BL71FgcwkvtHLdWrK6WsDS \
ghc-prof-crypton-connection-0.4.6-EpYbEhgynWEHAydR26M0y \
ghc-prof-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-http-client-0.7.19-4BIOUl8FXXcE32miDzHR9M \
ghc-prof-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-prof-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8 \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-tls-2.4.3-9EoJ6T6XUplFSFHrhcQuuh \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
