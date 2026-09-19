SUMMARY = "Haskell socks library development files"
DESCRIPTION = "This package provides the Haskell socks library development files."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-socks-devel-0.6.1-6.36.aarch64.rpm"
RPM_HASH = "8598df7770368787566aac3d12fb3f4751615bed75c06ec7479084c823c5ab46184faab31eba072ed60aed18288d73163773de66bc8e861788234020d40a1cc0"

RPROVIDES:${PN} += "ghc-devel-socks-0.6.1-3r1HLyqOfoa8tpqI7lEsnd \
ghc-socks-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-basement-0.0.16-EFfarL5MHPIHNlTrgpSdN2 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-cereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-socks"

inherit rpm
