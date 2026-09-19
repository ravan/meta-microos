SUMMARY = "Haskell emojis library development files"
DESCRIPTION = "This package provides the Haskell emojis library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.5"

RPM_NAME = "ghc-emojis-devel-0.1.5-1.3.aarch64.rpm"
RPM_HASH = "4e7407b84dc521bdd2505dc9c8b9a851db6bd76e34d7ff468d2abb1e1b60ff7e0f7d1543e1715754af734bb721a62f98243f37679be51bfc4d20bf88f3af1063"

RPROVIDES:${PN} += "ghc-devel-emojis-0.1.5-AZAxFgnk0gPLtmkqpmmj2s \
ghc-emojis-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-text-2.1.4-cf23 \
ghc-emojis"

inherit rpm
