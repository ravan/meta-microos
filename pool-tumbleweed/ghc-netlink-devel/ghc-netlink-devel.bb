SUMMARY = "Haskell netlink library development files"
DESCRIPTION = "This package provides the Haskell netlink library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1.1.0"

RPM_NAME = "ghc-netlink-devel-1.1.1.0-4.35.aarch64.rpm"
RPM_HASH = "ad4b36c92f4abb0a250be12f0848f75be5ed191602a24e4082fd3bc559bee2539b7219e809ec3cbcd251a2b6c892c6acceb528ac11113603cdc9b7e724e580b8"

RPROVIDES:${PN} += "ghc-devel-netlink-1.1.1.0-CXOPJRLMZM2H8eJ1F7yaYv \
ghc-netlink-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-cereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-monad-loops-0.4.3-DnSFazqaMXyCc2HbLgcz0b \
ghc-devel-pretty-hex-1.1-9KkuISSwhPFByR4xDG3StA \
ghc-devel-unix-2.8.8.0-178a \
ghc-netlink"

inherit rpm
