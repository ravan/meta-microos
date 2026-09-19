SUMMARY = "Haskell unliftio-core library development files"
DESCRIPTION = "This package provides the Haskell unliftio-core library development files."
LICENSE = "MIT"

PV = "0.2.1.0"

RPM_NAME = "ghc-unliftio-core-devel-0.2.1.0-3.23.aarch64.rpm"
RPM_HASH = "d014dc8f5f63a7dd6e972265c37a85df78560bfb0ce8d0a252f39da0cde0e2c41538ecd85d0cab236f297e5da1892e27e80a5b7b111c63a756ee45107de8fdc3"

RPROVIDES:${PN} += "ghc-devel-unliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92 \
ghc-unliftio-core-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-unliftio-core"

inherit rpm
