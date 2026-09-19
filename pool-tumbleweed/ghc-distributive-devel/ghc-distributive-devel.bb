SUMMARY = "Haskell distributive library development files"
DESCRIPTION = "This package provides the Haskell distributive library development files."
LICENSE = "BSD-2-Clause"

PV = "0.6.3"

RPM_NAME = "ghc-distributive-devel-0.6.3-1.3.aarch64.rpm"
RPM_HASH = "b34ef33ccaa268e867e1207e15e7543827a158d961b8b861a50c05a7fa5ef310d1f354937c5dedee684c5310c1162d13350874ee8a1d4d477cb71951fd9fd20c"

RPROVIDES:${PN} += "ghc-devel-distributive-0.6.3-9lg1Hxwh2KlJVxh3zQCgyL \
ghc-distributive-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-distributive"

inherit rpm
