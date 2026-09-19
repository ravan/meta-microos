SUMMARY = "Haskell unicode-transforms library development files"
DESCRIPTION = "This package provides the Haskell unicode-transforms library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-unicode-transforms-devel-0.4.0.1-10.3.aarch64.rpm"
RPM_HASH = "b0e6e3537586987e9d65fff81078790b6b8280ed394bced37c1ee7b338000e90724797073a600ea4d1394f66372b4ab0b2a05141530283d17490b1fd149e4657"

RPROVIDES:${PN} += "ghc-devel-unicode-transforms-0.4.0.1-KtQjAe86DCEJDcpSXQHRSI \
ghc-unicode-transforms-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-unicode-data-0.6.0-L8MzYkzbuQvKbpFsnfTHmj \
ghc-unicode-transforms"

inherit rpm
