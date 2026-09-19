SUMMARY = "Haskell iwlib library development files"
DESCRIPTION = "This package provides the Haskell iwlib library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-iwlib-devel-0.1.2-4.14.aarch64.rpm"
RPM_HASH = "bc885fae69c9b6eeea3960fb7747601628d4b1f37d0ea8fd2fcf5ec97029788a4c7df67942840ade47687e22cffa10d305d08d9d9bb9e5b3172add79ad1b5999"

RPROVIDES:${PN} += "ghc-devel-iwlib-0.1.2-CbOLYXTu5NPFzGiuLS7AmP \
ghc-iwlib-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-iwlib \
libiw-devel"

inherit rpm
