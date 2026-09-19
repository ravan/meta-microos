SUMMARY = "Haskell colour profiling library"
DESCRIPTION = "This package provides the Haskell colour profiling library."
LICENSE = "MIT"

PV = "2.3.7"

RPM_NAME = "ghc-colour-prof-2.3.7-1.2.aarch64.rpm"
RPM_HASH = "04b241e9ff9b5d305adbfbecfa8ca1cc4e2c7c81ebc17199b98a6f664eab017ee797b0da3104b3807e9904ff7e0f7e9c0ffd6519665002cf2fb097121d6e2e54"

RPROVIDES:${PN} += "ghc-colour-prof \
ghc-prof-colour-2.3.7-LuxtbazHK7IK55ldBice4c"

RDEPENDS:${PN} += "ghc-colour-devel \
ghc-prof-base-4.21.2.0-8844"

inherit rpm
