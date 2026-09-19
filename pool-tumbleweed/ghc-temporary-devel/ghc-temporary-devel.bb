SUMMARY = "Haskell temporary library development files"
DESCRIPTION = "This package provides the Haskell temporary library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "ghc-temporary-devel-1.3-6.30.aarch64.rpm"
RPM_HASH = "93cb7a08d71485ea62824de26a4e705975bc1f17aa2945190b88f6b6ed0e83eaf46cff2f85ec23318a09c11f49a2aa8f51cee1a6681fe188a2aa9fe43bd001a9"

RPROVIDES:${PN} += "ghc-devel-temporary-1.3-2Osk9MNG2oU9jER7tTbSTz \
ghc-temporary-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unix-2.8.8.0-178a \
ghc-temporary"

inherit rpm
