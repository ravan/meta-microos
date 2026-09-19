SUMMARY = "Haskell encoding profiling library"
DESCRIPTION = "This package provides the Haskell encoding profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.10.3"

RPM_NAME = "ghc-encoding-prof-0.10.3-1.3.aarch64.rpm"
RPM_HASH = "2073d4b54d9c6e1645cb6e6d8bf6a60300d4efbfed3e93eef3b09c25e0570b577d2e17a50ade71262d3a13d2b3f0aa7897f871b7b292aabd54466b4d0a16855d"

RPROVIDES:${PN} += "ghc-encoding-prof \
ghc-prof-encoding-0.10.3-AvKSpiZHZdhEtvUKaxdqNC"

RDEPENDS:${PN} += "ghc-encoding-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-binary-0.8.9.3-9861 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-regex-compat-0.95.2.2-BPr9re8H6vl1LOIxX40pHj"

inherit rpm
