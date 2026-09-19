SUMMARY = "Haskell cassava-megaparsec library development files"
DESCRIPTION = "This package provides the Haskell cassava-megaparsec library development \
files."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "ghc-cassava-megaparsec-devel-2.1.1-1.21.aarch64.rpm"
RPM_HASH = "0f1cf726ed2071ac7fa538090c5bf93ed880ab93fb51e093b809ad21a968c033296866ddbb9084bc6179d8acafa69cfb08093db8283b8eccc7bc23fd4f33ee8b"

RPROVIDES:${PN} += "ghc-cassava-megaparsec-devel \
ghc-devel-cassava-megaparsec-2.1.1-92PMhFSA6UZBxfXRek9rSe"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cassava-megaparsec \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-cassava-0.5.4.1-8IyxQgBHHLo5YfhT4Ar4sR \
ghc-devel-megaparsec-9.7.1-3bWkE5RywYh6b8gn4lQrB6 \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE"

inherit rpm
