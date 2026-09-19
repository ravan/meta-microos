SUMMARY = "Haskell unicode-data profiling library"
DESCRIPTION = "This package provides the Haskell unicode-data profiling library."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "ghc-unicode-data-prof-0.6.0-1.16.aarch64.rpm"
RPM_HASH = "28b891fc8fe415e1fdcb95440e6325d4306afd6c3629348f699c8370c9ec3fc033165d550f29f7ecc1be373705aff23032b5063c033a68e9145f69e1fd56191b"

RPROVIDES:${PN} += "ghc-prof-unicode-data-0.6.0-L8MzYkzbuQvKbpFsnfTHmj \
ghc-unicode-data-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-unicode-data-devel"

inherit rpm
