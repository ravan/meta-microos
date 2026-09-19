SUMMARY = "Haskell th-expand-syns library development files"
DESCRIPTION = "This package provides the Haskell th-expand-syns library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.12.0"

RPM_NAME = "ghc-th-expand-syns-devel-0.4.12.0-2.3.aarch64.rpm"
RPM_HASH = "f3d369d159453586dae77ce1a3e62360e61dcab4e4b20238c6d4cf378059c49c3fc783b82d5ca96fdf97c2be38ad5cdf243414375afb2950f8c9b7a322df16c0"

RPROVIDES:${PN} += "ghc-devel-th-expand-syns-0.4.12.0-2BWsmg9V6mHJNn5DoPUfmz \
ghc-th-expand-syns-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-syb-0.7.4-6fi78MDXPhtHdqjdF3SBYJ \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-th-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7 \
ghc-th-expand-syns"

inherit rpm
