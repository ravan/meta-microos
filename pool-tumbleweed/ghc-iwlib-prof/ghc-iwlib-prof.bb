SUMMARY = "Haskell iwlib profiling library"
DESCRIPTION = "This package provides the Haskell iwlib profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-iwlib-prof-0.1.2-4.14.aarch64.rpm"
RPM_HASH = "17c5c480327b8552ee630d41254eda1830cd3f8c766c6f599b9922e35ec10ca4bf5ccd07d7aea19a0a74926a854abbf164f9bf81b2c54c910934dbe0183616c4"

RPROVIDES:${PN} += "ghc-iwlib-prof \
ghc-prof-iwlib-0.1.2-CbOLYXTu5NPFzGiuLS7AmP"

RDEPENDS:${PN} += "ghc-iwlib-devel \
ghc-prof-base-4.21.2.0-8844"

inherit rpm
