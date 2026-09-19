SUMMARY = "Haskell wai-logger library development files"
DESCRIPTION = "This package provides the Haskell wai-logger library development files."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "ghc-wai-logger-devel-2.5.0-1.23.aarch64.rpm"
RPM_HASH = "666d5b3aefe4f583e5550f35ac7b216fdb3112d5afffb7b4096bd4842df3bfd6e07c3c7331b706b747f8db64ddedc47fa9e68c28543bc9034adbc673f8b38722"

RPROVIDES:${PN} += "ghc-devel-wai-logger-2.5.0-3cHzLKgypSbCdVbvyxsJiz \
ghc-wai-logger-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-byteorder-1.0.4-2KwV8jNH81I9JBUzKyr4X2 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-fast-logger-3.2.6-JkXOEB4fbDV8mDlAr0wMkH \
ghc-devel-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-devel-wai-3.2.4-Is1UVC1czjX2cAufnl3tJW \
ghc-wai-logger"

inherit rpm
