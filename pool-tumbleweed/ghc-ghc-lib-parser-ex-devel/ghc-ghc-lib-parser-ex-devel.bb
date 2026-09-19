SUMMARY = "Haskell ghc-lib-parser-ex library development files"
DESCRIPTION = "This package provides the Haskell ghc-lib-parser-ex library development \
files."
LICENSE = "BSD-3-Clause"

PV = "9.12.0.0"

RPM_NAME = "ghc-ghc-lib-parser-ex-devel-9.12.0.0-1.11.aarch64.rpm"
RPM_HASH = "d9eb23a3da46b8664a1a5d077d4de227e651ff6f55fdaabbca981529cc120bb37c54ab097a822e6816729f701bf69a55ea46457ab8af9a654bc208a213d39e27"

RPROVIDES:${PN} += "ghc-devel-ghc-lib-parser-ex-9.12.0.0-AQFnDqoQhTuCgXxh1T0SWZ \
ghc-ghc-lib-parser-ex-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-ghc-lib-parser-9.12.3.20251228-A26EZnaiNey14MMYQvPU7L \
ghc-devel-uniplate-1.6.13-FhUIjk7rCCk8dCOMm0dejl \
ghc-ghc-lib-parser-ex"

inherit rpm
