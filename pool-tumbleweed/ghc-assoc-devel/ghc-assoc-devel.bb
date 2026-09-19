SUMMARY = "Haskell assoc library development files"
DESCRIPTION = "This package provides the Haskell assoc library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "ghc-assoc-devel-1.1.1-3.3.aarch64.rpm"
RPM_HASH = "f6e31f53e8b1de192606f25ea21151e11b0d8f69a39832e1ff3e3245d1242c64ea4161ca6e30b04d0b4279d07f98419081464709dc28c466d44a1a5d8b56ac41"

RPROVIDES:${PN} += "ghc-assoc-devel \
ghc-devel-assoc-1.1.1-7ZKlIzFkmc1FQCJcpfYrTi"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-assoc \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844"

inherit rpm
