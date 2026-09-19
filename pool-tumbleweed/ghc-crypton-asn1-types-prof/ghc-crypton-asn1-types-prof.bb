SUMMARY = "Haskell crypton-asn1-types profiling library"
DESCRIPTION = "This package provides the Haskell crypton-asn1-types profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "ghc-crypton-asn1-types-prof-0.4.1-1.3.aarch64.rpm"
RPM_HASH = "2cbca10e129b015fdfd2a06242d74eb15d18d4e9e0a7b85b4388685d94f8f8ea1f4a9ad24a54d591e4efa8978719d09bc4aac07347dc36f3ccb750675a524061"

RPROVIDES:${PN} += "ghc-crypton-asn1-types-prof \
ghc-prof-crypton-asn1-types-0.4.1-LmR9a0v0hFeGm5Drmsi7UB"

RDEPENDS:${PN} += "ghc-crypton-asn1-types-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base16-1.0-GqCyVT5DfwtBcN8MC2i0Li \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-time-hourglass-0.3.0-3eH7mx2lN21L13Pl8jWv6l"

inherit rpm
