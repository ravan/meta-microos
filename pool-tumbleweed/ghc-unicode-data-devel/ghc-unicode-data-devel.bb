SUMMARY = "Haskell unicode-data library development files"
DESCRIPTION = "This package provides the Haskell unicode-data library development files."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "ghc-unicode-data-devel-0.6.0-1.16.aarch64.rpm"
RPM_HASH = "1a0d57fbc11cb29c13fcb20bbba2a207340ef436ec1ba9986ccd84741a86c404d2597bdb0cc9f312c1b39709da87db671bd31bfc31b1c7e7acdd3861138f0157"

RPROVIDES:${PN} += "ghc-devel-unicode-data-0.6.0-L8MzYkzbuQvKbpFsnfTHmj \
ghc-unicode-data-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-unicode-data"

inherit rpm
