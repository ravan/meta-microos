SUMMARY = "Haskell byteorder library development files"
DESCRIPTION = "This package provides the Haskell byteorder library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "ghc-byteorder-devel-1.0.4-4.19.aarch64.rpm"
RPM_HASH = "4186a5e3ef6ada9ede98b19f2b5c2666f872483c27b515122133d1249b639efbd8e88dc633c51960b9ea9f77388ce5b92e3697c7a638c0dd6a7bdbf6670e031f"

RPROVIDES:${PN} += "ghc-byteorder-devel \
ghc-devel-byteorder-1.0.4-2KwV8jNH81I9JBUzKyr4X2"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-byteorder \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844"

inherit rpm
