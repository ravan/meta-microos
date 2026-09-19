SUMMARY = "Haskell ghc-lib-parser-ex profiling library"
DESCRIPTION = "This package provides the Haskell ghc-lib-parser-ex profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.12.0.0"

RPM_NAME = "ghc-ghc-lib-parser-ex-prof-9.12.0.0-1.11.aarch64.rpm"
RPM_HASH = "8d80273650d099d8eabdcb391cf9f67fae587e629ec35789858888740a46cd9082373d8bb70d853d073f1f56c1b5043d888249f0cebf42615d3f40f869472a47"

RPROVIDES:${PN} += "ghc-ghc-lib-parser-ex-prof \
ghc-prof-ghc-lib-parser-ex-9.12.0.0-AQFnDqoQhTuCgXxh1T0SWZ"

RDEPENDS:${PN} += "ghc-ghc-lib-parser-ex-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-ghc-lib-parser-9.12.3.20251228-A26EZnaiNey14MMYQvPU7L \
ghc-prof-uniplate-1.6.13-FhUIjk7rCCk8dCOMm0dejl"

inherit rpm
