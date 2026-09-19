SUMMARY = "Haskell iproute library development files"
DESCRIPTION = "This package provides the Haskell iproute library development files."
LICENSE = "BSD-3-Clause"

PV = "1.7.15"

RPM_NAME = "ghc-iproute-devel-1.7.15-1.19.aarch64.rpm"
RPM_HASH = "15f025f3130a986adc7e4686d0bb6b5114031aad1bd62acb0900b68a1a1346b05996d71fce6f99269ccb65e07d8fc77364193ceeac9dd438fc58a5c406214726"

RPROVIDES:${PN} += "ghc-devel-iproute-1.7.15-E8DjYDi46DFHUJbuCQco8p \
ghc-iproute-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-appar-0.1.8-WSZSnBitxp1mS4dOP2hyq \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-byteorder-1.0.4-2KwV8jNH81I9JBUzKyr4X2 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-iproute"

inherit rpm
