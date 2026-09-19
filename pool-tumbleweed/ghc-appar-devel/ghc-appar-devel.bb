SUMMARY = "Haskell appar library development files"
DESCRIPTION = "This package provides the Haskell appar library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "ghc-appar-devel-0.1.8-4.23.aarch64.rpm"
RPM_HASH = "ad04c25d70c9a8eef379ea8348e99eadcfa6c4746ef33e0694ac3336599d1df5c3a2b092283b83175771930941cf8f6dc28b30e1936bcfd22d290deff987804a"

RPROVIDES:${PN} += "ghc-appar-devel \
ghc-devel-appar-0.1.8-WSZSnBitxp1mS4dOP2hyq"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-appar \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be"

inherit rpm
