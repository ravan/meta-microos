SUMMARY = "Haskell uglymemo library development files"
DESCRIPTION = "This package provides the Haskell uglymemo library development files."
LICENSE = "SUSE-Public-Domain"

PV = "0.1.0.1"

RPM_NAME = "ghc-uglymemo-devel-0.1.0.1-4.19.aarch64.rpm"
RPM_HASH = "586cc6c8c12a30eaf4520fed2f30d7ba2a4175c164b887efefe9ca0c228b5409bd81d1c2f6245b87e0fcef40e9b36fc5b8d6e481d6745d0cb39d7fa28d7fa320"

RPROVIDES:${PN} += "ghc-devel-uglymemo-0.1.0.1-7xglRopOL0Q1bomJJkVUR \
ghc-uglymemo-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-uglymemo"

inherit rpm
