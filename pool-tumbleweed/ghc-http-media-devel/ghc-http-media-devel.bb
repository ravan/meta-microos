SUMMARY = "Haskell http-media library development files"
DESCRIPTION = "This package provides the Haskell http-media library development files."
LICENSE = "MIT"

PV = "0.8.1.1"

RPM_NAME = "ghc-http-media-devel-0.8.1.1-3.21.aarch64.rpm"
RPM_HASH = "a2f9977ef415d09b50c11152bbdf9667a4ee5e0f39a351643874bff4e6cc25ef69c4a5a01ef1c8a841161322de0c61890438f8c5241213b405390834f314f417"

RPROVIDES:${PN} += "ghc-devel-http-media-0.8.1.1-CGZiZUC7By82YjYrR6pIDk \
ghc-http-media-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-http-media"

inherit rpm
