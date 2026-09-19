SUMMARY = "Haskell skylighting-format-context library development files"
DESCRIPTION = "This package provides the Haskell skylighting-format-context library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.2"

RPM_NAME = "ghc-skylighting-format-context-devel-0.1.0.2-1.79.aarch64.rpm"
RPM_HASH = "be4e599c0d1694b7e36e7787ea5edd871d522359aeca41e80dd21aaefe30668b169563fa9c98720af33cb355a274c8803785cfd60a0cbc270fac3b976ea03cda"

RPROVIDES:${PN} += "ghc-devel-skylighting-format-context-0.1.0.2-EzEDygUtfEzGScwK06ebkH \
ghc-skylighting-format-context-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-skylighting-core-0.14.7-HkvmMdabOkA2nMBfVgE9uo \
ghc-devel-text-2.1.4-cf23 \
ghc-skylighting-format-context"

inherit rpm
