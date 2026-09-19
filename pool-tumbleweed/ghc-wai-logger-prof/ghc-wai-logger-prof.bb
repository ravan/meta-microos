SUMMARY = "Haskell wai-logger profiling library"
DESCRIPTION = "This package provides the Haskell wai-logger profiling library."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "ghc-wai-logger-prof-2.5.0-1.23.aarch64.rpm"
RPM_HASH = "bdb067095d617bbe115179d1308017abfe544b5972ebfc00b8ced67a62b056369fd756a64e87bdfd45770e28538340afbe2ce523f3df6d3989c7778fa94f4538"

RPROVIDES:${PN} += "ghc-prof-wai-logger-2.5.0-3cHzLKgypSbCdVbvyxsJiz \
ghc-wai-logger-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-byteorder-1.0.4-2KwV8jNH81I9JBUzKyr4X2 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-fast-logger-3.2.6-JkXOEB4fbDV8mDlAr0wMkH \
ghc-prof-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-prof-wai-3.2.4-Is1UVC1czjX2cAufnl3tJW \
ghc-wai-logger-devel"

inherit rpm
