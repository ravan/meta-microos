SUMMARY = "Haskell html library development files"
DESCRIPTION = "This package provides the Haskell html library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.1.2"

RPM_NAME = "ghc-html-devel-1.0.1.2-4.19.aarch64.rpm"
RPM_HASH = "4be1bd269b588827ca50b2b8365bad0912ac703724279dc96adfaf868e3e548095ff482dca0cf2082fc631b2eb418cf16f4ba5dc5d9209ddc2d69b5367db1bd8"

RPROVIDES:${PN} += "ghc-devel-html-1.0.1.2-47pIZc0gzI25DOiguxUrYX \
ghc-html-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-html"

inherit rpm
