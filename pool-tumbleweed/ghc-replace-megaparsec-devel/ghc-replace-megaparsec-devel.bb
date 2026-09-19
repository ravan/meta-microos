SUMMARY = "Haskell replace-megaparsec library development files"
DESCRIPTION = "This package provides the Haskell replace-megaparsec library development \
files."
LICENSE = "BSD-2-Clause"

PV = "1.5.0.1"

RPM_NAME = "ghc-replace-megaparsec-devel-1.5.0.1-1.12.aarch64.rpm"
RPM_HASH = "7f801087a88dfc52ae9ea6068fb4901899659d1b92896644bbc655cb1d2feb741773c73744f4afba0f178509600e0011bf6843df4ae0777d1394449cdce329f0"

RPROVIDES:${PN} += "ghc-devel-replace-megaparsec-1.5.0.1-3raT401RHe83TCy1jsbTxZ \
ghc-replace-megaparsec-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-megaparsec-9.7.1-3bWkE5RywYh6b8gn4lQrB6 \
ghc-devel-parser-combinators-1.3.1-L2vTYvTgTG7FdcDqlc42x9 \
ghc-devel-text-2.1.4-cf23 \
ghc-replace-megaparsec"

inherit rpm
