SUMMARY = "Haskell cassava-megaparsec profiling library"
DESCRIPTION = "This package provides the Haskell cassava-megaparsec profiling library."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "ghc-cassava-megaparsec-prof-2.1.1-1.21.aarch64.rpm"
RPM_HASH = "f198f030474f4aaa8e8281e03355b3ade2e738b7749dca14e0a5cb501197757f049a46f8958a36bd2d804ef3c172b3dae76b5d9417c696ded8ae188943e0d50e"

RPROVIDES:${PN} += "ghc-cassava-megaparsec-prof \
ghc-prof-cassava-megaparsec-2.1.1-92PMhFSA6UZBxfXRek9rSe"

RDEPENDS:${PN} += "ghc-cassava-megaparsec-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-cassava-0.5.4.1-8IyxQgBHHLo5YfhT4Ar4sR \
ghc-prof-megaparsec-9.7.1-3bWkE5RywYh6b8gn4lQrB6 \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE"

inherit rpm
