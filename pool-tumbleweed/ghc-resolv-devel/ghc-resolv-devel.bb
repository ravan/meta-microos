SUMMARY = "Haskell resolv library development files"
DESCRIPTION = "This package provides the Haskell resolv library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0.3"

RPM_NAME = "ghc-resolv-devel-0.2.0.3-1.9.aarch64.rpm"
RPM_HASH = "7ae37bf76ec8f6cefa58bc2470e8865a68c35bab2f2aa51b821fcee1afbd33e4cae450f54f1c5b1839b7cf58eb22ae8c7f53b596745ab67a8bf45ff8b3131a14"

RPROVIDES:${PN} += "ghc-devel-resolv-0.2.0.3-2a3UXbRQZR0IVSb1MrCNb4 \
ghc-resolv-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-resolv"

inherit rpm
