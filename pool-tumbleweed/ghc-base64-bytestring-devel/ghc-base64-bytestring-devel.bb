SUMMARY = "Haskell base64-bytestring library development files"
DESCRIPTION = "This package provides the Haskell base64-bytestring library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.0"

RPM_NAME = "ghc-base64-bytestring-devel-1.2.1.0-3.30.aarch64.rpm"
RPM_HASH = "e0686e013d01323fd63dbd00eded6f768e39fbbff97d3f4b7d5d69e7f62031de2f7d020680641450bd8ca63bee486e6d162687b787497f5f684c43b2afea3003"

RPROVIDES:${PN} += "ghc-base64-bytestring-devel \
ghc-devel-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-base64-bytestring \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be"

inherit rpm
