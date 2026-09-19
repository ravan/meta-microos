SUMMARY = "Haskell hscolour library development files"
DESCRIPTION = "This package provides the Haskell hscolour library development files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.25"

RPM_NAME = "ghc-hscolour-devel-1.25-1.32.aarch64.rpm"
RPM_HASH = "b26593895fd056a13117a7f8ed2da926c25a91d32c896bb09da6c189464e0b7294b0ac2b80d6681f682dcfa8af1d90542a98967b058aae90a782716c8b53b471"

RPROVIDES:${PN} += "ghc-devel-hscolour-1.25-7g5wxbCbTVu2XnpAXvjFVU \
ghc-hscolour-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-hscolour"

inherit rpm
