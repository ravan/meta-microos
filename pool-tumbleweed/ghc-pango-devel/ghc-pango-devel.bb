SUMMARY = "Haskell pango library development files"
DESCRIPTION = "This package provides the Haskell pango library development files."
LICENSE = "LGPL-2.1-only"

PV = "0.13.12.0"

RPM_NAME = "ghc-pango-devel-0.13.12.0-1.12.aarch64.rpm"
RPM_HASH = "a0551761cc1f1a35482d1f2585dfb0fce9eeecfd3ff1133c5b63259e823e277347a5af8125c9227e411c0c105cf3d201452700a0b288e577cefd50b3ccecf0af"

RPROVIDES:${PN} += "ghc-devel-pango-0.13.12.0-EYXFDNPBrZO4dDymUfkqjN \
ghc-pango-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-cairo-0.13.12.0-4t6EsC3Gqxb9Xow3SHIyd2 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-glib-0.13.12.0-ARZovtA2xnqKsDZ2Db5KU2 \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-pretty-1.1.3.6-b7fd \
ghc-devel-process-1.6.26.1-905d \
ghc-devel-text-2.1.4-cf23 \
ghc-pango \
pkgconfig \
pkgconfig-cairo \
pkgconfig-pango \
pkgconfig-pangocairo"

inherit rpm
