SUMMARY = "Haskell ed25519 library development files"
DESCRIPTION = "This package provides the Haskell ed25519 library development files."
LICENSE = "MIT"

PV = "0.0.5.0"

RPM_NAME = "ghc-ed25519-devel-0.0.5.0-18.14.aarch64.rpm"
RPM_HASH = "a7653434cbb730f44c518da033f469487ed84f56d449d6b0e45425f0f333fc0d546d921f5c2b4498daa40d124db8445182f5d0534403b908a24adcea823c8688"

RPROVIDES:${PN} += "ghc-devel-ed25519-0.0.5.0-LJoM5RH0WDTKH6EJLYztMY \
ghc-ed25519-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-ed25519"

inherit rpm
