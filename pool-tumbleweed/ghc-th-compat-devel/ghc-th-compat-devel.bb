SUMMARY = "Haskell th-compat library development files"
DESCRIPTION = "This package provides the Haskell th-compat library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.7"

RPM_NAME = "ghc-th-compat-devel-0.1.7-1.3.aarch64.rpm"
RPM_HASH = "81ae079801df4420c904daffbd4eb7500e542362528672b6520836216f7a87897195383cd2eb19f8a231f2b25ec72a7fd04384375fe2db6d6020920a16b4f279"

RPROVIDES:${PN} += "ghc-devel-th-compat-0.1.7-A4ZdivYymzPCDISaa5LNtp \
ghc-th-compat-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-th-compat"

inherit rpm
