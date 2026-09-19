SUMMARY = "Haskell safe profiling library"
DESCRIPTION = "This package provides the Haskell safe profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "ghc-safe-prof-0.3.21-2.25.aarch64.rpm"
RPM_HASH = "d4f7c809705ec67622cf7596d9c67784b0e0f36a51b1ad71e4b1d32258b655f115b788ac2174d5922547ae98758d2574841751c534633755e48c9e0228c7f60c"

RPROVIDES:${PN} += "ghc-prof-safe-0.3.21-AzRUUYeJ47sQc55olWnva \
ghc-safe-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-safe-devel"

inherit rpm
