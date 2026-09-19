SUMMARY = "Haskell asn1-encoding profiling library"
DESCRIPTION = "This package provides the Haskell asn1-encoding profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.9.6"

RPM_NAME = "ghc-asn1-encoding-prof-0.9.6-8.35.aarch64.rpm"
RPM_HASH = "106692350cfcdfdf9242b193591a2f17ff9912d1857eaa56cde499de32bcdf58d8231d31dd8382d89812cd8a5e1cfd5fd7694ea357dbb6a9907019d5041c366c"

RPROVIDES:${PN} += "ghc-asn1-encoding-prof \
ghc-prof-asn1-encoding-0.9.6-6HoFXCc54fWHW7G1NmR4HI"

RDEPENDS:${PN} += "ghc-asn1-encoding-devel \
ghc-prof-asn1-types-0.3.4-7PM4xMGOCo5HtpL9dIOMTo \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-hourglass-0.2.12-AVWrQ59TfGxLOqFeNnaO7o"

inherit rpm
