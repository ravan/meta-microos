SUMMARY = "Haskell pretty-show library development files"
DESCRIPTION = "This package provides the Haskell pretty-show library development files."
LICENSE = "MIT"

PV = "1.10"

RPM_NAME = "ghc-pretty-show-devel-1.10-4.37.aarch64.rpm"
RPM_HASH = "cf41f96222c8745100bd0fbef32e9684af5e6e85705b603efef821201bdcd5d6161008af60bb40f705b7014d2824878ef4fe679e746968e38f8a46dd83b533ba"

RPROVIDES:${PN} += "ghc-devel-pretty-show-1.10-9HKVlh92Ga177833HqSrwq \
ghc-pretty-show-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-devel-haskell-lexer-1.2.1-4PpJ3cUTICwEJqFuz43JwQ \
ghc-devel-pretty-1.1.3.6-b7fd \
ghc-devel-text-2.1.4-cf23 \
ghc-pretty-show"

inherit rpm
