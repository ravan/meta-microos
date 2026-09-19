SUMMARY = "Haskell asn1-types profiling library"
DESCRIPTION = "This package provides the Haskell asn1-types profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-asn1-types-prof-0.3.4-5.31.aarch64.rpm"
RPM_HASH = "d580e688597a2fd5001db62b773e07a3fed1b104db62a04801128f59b6a8e50f9bd552ccacb326dab41dbb086f8ae70adc210a0bcefaf960d78d19b964df0a6e"

RPROVIDES:${PN} += "ghc-asn1-types-prof \
ghc-prof-asn1-types-0.3.4-7PM4xMGOCo5HtpL9dIOMTo"

RDEPENDS:${PN} += "ghc-asn1-types-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-hourglass-0.2.12-AVWrQ59TfGxLOqFeNnaO7o \
ghc-prof-memory-0.18.0-4OCVGiXkS6t9StTfiwlZlu"

inherit rpm
