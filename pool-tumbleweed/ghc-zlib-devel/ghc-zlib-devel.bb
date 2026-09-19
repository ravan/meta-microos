SUMMARY = "Haskell zlib library development files"
DESCRIPTION = "This package provides the Haskell zlib library development files."
LICENSE = "BSD-2-Clause"

PV = "0.7.1.1"

RPM_NAME = "ghc-zlib-devel-0.7.1.1-1.9.aarch64.rpm"
RPM_HASH = "4733d0913568a934e56af366bf71e7a55524c6a0209ecbd09c9131b0b440f841d610f8354340c719ae0d379dd3d25f7f3bb0ef53df1d05498b2cad206e166457"

RPROVIDES:${PN} += "ghc-devel-zlib-0.7.1.1-9wvDfX7JlnE99sTdZLYOpU \
ghc-zlib-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-zlib \
pkgconfig \
pkgconfig-zlib"

inherit rpm
