SUMMARY = "Haskell pem profiling library"
DESCRIPTION = "This package provides the Haskell pem profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "ghc-pem-prof-0.2.4-8.31.aarch64.rpm"
RPM_HASH = "665058adb04b2d407a0007732be2606f3cd391beafc1bb30c7a8c81ea072d6e7b149c689c86cb45ed57a15eed4d4eb20dc83b8293ccbce80d63f01d5669fed70"

RPROVIDES:${PN} += "ghc-pem-prof \
ghc-prof-pem-0.2.4-HqB1KmdaogjHqJ1PBuavhl"

RDEPENDS:${PN} += "ghc-pem-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-basement-0.0.16-EFfarL5MHPIHNlTrgpSdN2 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-memory-0.18.0-4OCVGiXkS6t9StTfiwlZlu"

inherit rpm
