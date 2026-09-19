SUMMARY = "Haskell atomic-counter library development files"
DESCRIPTION = "This package provides the Haskell atomic-counter library development files."
LICENSE = "Apache-2.0"

PV = "0.1.2.4"

RPM_NAME = "ghc-atomic-counter-devel-0.1.2.4-1.9.aarch64.rpm"
RPM_HASH = "d43dbc3a2e720189d59fecde2bc2c25cc71e09b309f47c0689df461c736d1d238ecdbac0f05ba68abe195a5633976b52891d8946fa117e64e92fd4df74352035"

RPROVIDES:${PN} += "ghc-atomic-counter-devel \
ghc-devel-atomic-counter-0.1.2.4-K5650WCkbBZIqAcUX7ixZ6"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-atomic-counter \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844"

inherit rpm
