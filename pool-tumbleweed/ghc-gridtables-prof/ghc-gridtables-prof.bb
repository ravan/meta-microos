SUMMARY = "Haskell gridtables profiling library"
DESCRIPTION = "This package provides the Haskell gridtables profiling library."
LICENSE = "MIT"

PV = "0.1.1.0"

RPM_NAME = "ghc-gridtables-prof-0.1.1.0-1.5.aarch64.rpm"
RPM_HASH = "b42864f3ff735d842188d5488389a8afdaddff2ebc80ede1c36957b1ad10ff510847fb1e30942895cde1e471fd10a589ebe03570b9205c1657652e118fb09145"

RPROVIDES:${PN} += "ghc-gridtables-prof \
ghc-prof-gridtables-0.1.1.0-KsHUhKw0ygq7hJHkhQZNzX"

RDEPENDS:${PN} += "ghc-gridtables-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-doclayout-0.5.0.3-6oU5Og9jiD67xwlm4qJ1ii \
ghc-prof-parsec-3.1.18.0-be05 \
ghc-prof-text-2.1.4-cf23"

inherit rpm
