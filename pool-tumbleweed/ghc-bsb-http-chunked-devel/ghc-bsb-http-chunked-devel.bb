SUMMARY = "Haskell bsb-http-chunked library development files"
DESCRIPTION = "This package provides the Haskell bsb-http-chunked library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.0.0.4"

RPM_NAME = "ghc-bsb-http-chunked-devel-0.0.0.4-7.17.aarch64.rpm"
RPM_HASH = "153cbd207a37bfef526840fc0e57ff5fe6e85574c0b3da6b92951143a122a9faa021fc3173178e310ef94aed323b81e882f33a096a796b26c641da0639b203df"

RPROVIDES:${PN} += "ghc-bsb-http-chunked-devel \
ghc-devel-bsb-http-chunked-0.0.0.4-5cZHaHeIaQxIWhD1tKvYpE"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-bsb-http-chunked \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be"

inherit rpm
