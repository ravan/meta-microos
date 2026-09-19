SUMMARY = "Haskell deriving-aeson profiling library"
DESCRIPTION = "This package provides the Haskell deriving-aeson profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.10"

RPM_NAME = "ghc-deriving-aeson-prof-0.2.10-1.22.aarch64.rpm"
RPM_HASH = "e3508e95975a0402e707c3e69d919148e46c16df81ed7694ca5fd2e6499e115fedc796845fe69a8077e79ec5c192f1a98c5a35d4a6adcddb1a3063d0b82d0282"

RPROVIDES:${PN} += "ghc-deriving-aeson-prof \
ghc-prof-deriving-aeson-0.2.10-A2Hr72Vk9XP91w802TwQUN"

RDEPENDS:${PN} += "ghc-deriving-aeson-devel \
ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-base-4.21.2.0-8844"

inherit rpm
