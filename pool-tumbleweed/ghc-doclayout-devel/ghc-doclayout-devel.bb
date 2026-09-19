SUMMARY = "Haskell doclayout library development files"
DESCRIPTION = "This package provides the Haskell doclayout library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.3"

RPM_NAME = "ghc-doclayout-devel-0.5.0.3-1.3.aarch64.rpm"
RPM_HASH = "121afa8b274ef5bafde846dc8442d92da2111142f0739ebaca180322c68f1b55c6aac2a77c8e99832262516fd708da79325201287c7a37b48d4c3cdb80d8e175"

RPROVIDES:${PN} += "ghc-devel-doclayout-0.5.0.3-6oU5Og9jiD67xwlm4qJ1ii \
ghc-doclayout-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-emojis-0.1.5-AZAxFgnk0gPLtmkqpmmj2s \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-safe-0.3.21-AzRUUYeJ47sQc55olWnva \
ghc-devel-text-2.1.4-cf23 \
ghc-doclayout"

inherit rpm
