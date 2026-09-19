SUMMARY = "Haskell digest library development files"
DESCRIPTION = "This package provides the Haskell digest library development files."
LICENSE = "BSD-2-Clause"

PV = "0.0.2.1"

RPM_NAME = "ghc-digest-devel-0.0.2.1-1.25.aarch64.rpm"
RPM_HASH = "19e9d8bf18036944881b2595749ea6465c623755236f7652e82252b27b3cada78478dba05252092b9817a2d906d138f7526e76cab53431b0b5fd061cd9742e89"

RPROVIDES:${PN} += "ghc-devel-digest-0.0.2.1-KdJahDzYM113RUTsWm7UXN \
ghc-digest-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-digest \
pkgconfig \
pkgconfig-zlib"

inherit rpm
