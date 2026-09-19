SUMMARY = "Haskell OneTuple library development files"
DESCRIPTION = "This package provides the Haskell OneTuple library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.3"

RPM_NAME = "ghc-OneTuple-devel-0.4.3-1.3.aarch64.rpm"
RPM_HASH = "fb8fd06014eb2a14e8589fdad72df7a7c1f09831816991fbfd00d191d751dda28bf1e49af79afbd157091b7ea25c2cc8a0bcd93859b7437805936d0e7027af41"

RPROVIDES:${PN} += "ghc-OneTuple-devel \
ghc-devel-OneTuple-0.4.3-6DcV56rVPgKHcnOuxvKUVo"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-OneTuple \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-devel-template-haskell-2.23.0.0-358a"

inherit rpm
