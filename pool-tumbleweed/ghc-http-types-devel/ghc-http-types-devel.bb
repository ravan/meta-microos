SUMMARY = "Haskell http-types library development files"
DESCRIPTION = "This package provides the Haskell http-types library development files."
LICENSE = "BSD-3-Clause"

PV = "0.12.5"

RPM_NAME = "ghc-http-types-devel-0.12.5-1.3.aarch64.rpm"
RPM_HASH = "8d65920dc2910af0e3e03c3c799dc2cf32728bc0dce206bfd98e740ecd41db6d09a3976940228e323c703800bf8abd5db9e132527e0bed9e9b5c8b0de07e9770"

RPROVIDES:${PN} += "ghc-devel-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-http-types-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-devel-text-2.1.4-cf23 \
ghc-http-types"

inherit rpm
