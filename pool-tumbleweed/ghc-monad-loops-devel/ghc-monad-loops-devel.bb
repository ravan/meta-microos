SUMMARY = "Haskell monad-loops library development files"
DESCRIPTION = "This package provides the Haskell monad-loops library development files."
LICENSE = "SUSE-Public-Domain"

PV = "0.4.3"

RPM_NAME = "ghc-monad-loops-devel-0.4.3-11.23.aarch64.rpm"
RPM_HASH = "962b1ea788ec99416c44e899f88c9ff0f26f57700bcab81b97ffc54c66485b7e9c0151408eb19b555049680c6d16129a1fa78051e7ea0cadd2683fee6fb88ebf"

RPROVIDES:${PN} += "ghc-devel-monad-loops-0.4.3-DnSFazqaMXyCc2HbLgcz0b \
ghc-monad-loops-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-monad-loops"

inherit rpm
