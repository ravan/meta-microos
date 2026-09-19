SUMMARY = "Haskell emojis profiling library"
DESCRIPTION = "This package provides the Haskell emojis profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.5"

RPM_NAME = "ghc-emojis-prof-0.1.5-1.3.aarch64.rpm"
RPM_HASH = "0e7ccf2551f3680fa5369b1f72ed223bec6351efe15a75b7f46a05e7e206c5c757a97851f849e70b381077179a9f6a3718cae33c9861876e3893cef5cf4f63c6"

RPROVIDES:${PN} += "ghc-emojis-prof \
ghc-prof-emojis-0.1.5-AZAxFgnk0gPLtmkqpmmj2s"

RDEPENDS:${PN} += "ghc-emojis-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-text-2.1.4-cf23"

inherit rpm
