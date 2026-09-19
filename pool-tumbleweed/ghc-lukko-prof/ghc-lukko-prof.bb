SUMMARY = "Haskell lukko profiling library"
DESCRIPTION = "This package provides the Haskell lukko profiling library."
LICENSE = "GPL-2.0-or-later & BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-lukko-prof-0.1.2-2.14.aarch64.rpm"
RPM_HASH = "6d818ae25d6630e38763c730054b6872698fd1602e84e974ab51605ec7d0007a9ae3d65059b3755b1f95fc605896942f7125cd77cd60f33d7893d3d88c4f9a47"

RPROVIDES:${PN} += "ghc-lukko-prof \
ghc-prof-lukko-0.1.2-KyYOwE0CZU8A6c79eyT2Xk"

RDEPENDS:${PN} += "ghc-lukko-devel \
ghc-prof-base-4.21.2.0-8844"

inherit rpm
