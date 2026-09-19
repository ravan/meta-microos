SUMMARY = "Haskell path-pieces library development files"
DESCRIPTION = "This package provides the Haskell path-pieces library development files."
LICENSE = "BSD-2-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-path-pieces-devel-0.2.1-12.19.aarch64.rpm"
RPM_HASH = "ad98215a432809cd4d4af474829dc42ed63438095c251bc087ef194757a29c96a11315bc8879f4a7d364f2f3f2371707ecb984360fdc784efdf6089e107c8f2a"

RPROVIDES:${PN} += "ghc-devel-path-pieces-0.2.1-FtFHzM20JKUFHdFVBop6JH \
ghc-path-pieces-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-time-1.14-a7dc \
ghc-path-pieces"

inherit rpm
