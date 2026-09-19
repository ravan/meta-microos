SUMMARY = "Haskell kan-extensions library development files"
DESCRIPTION = "This package provides the Haskell kan-extensions library development files."
LICENSE = "BSD-3-Clause"

PV = "5.2.8"

RPM_NAME = "ghc-kan-extensions-devel-5.2.8-1.3.aarch64.rpm"
RPM_HASH = "67d40a4a26528bd9a18150caa1c8769db9036d2d827893b907b50acccb06cacd97063a58312c5b4de6aa44429fda596bc2ab3a44d85fa8e191d58d9cb94538ee"

RPROVIDES:${PN} += "ghc-devel-kan-extensions-5.2.8-BhPXqlF7GPZ4azZSK3TJ3I \
ghc-kan-extensions-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-adjunctions-4.4.4-4nqsP3yaf6U1iY0vApuE6e \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-comonad-5.0.10-Adp50yscRn74SK6wUdL7QP \
ghc-devel-contravariant-1.5.6-7FVTzec2jegEwzkeRkQOi4 \
ghc-devel-distributive-0.6.3-9lg1Hxwh2KlJVxh3zQCgyL \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-free-5.2-4eWU5ydqIMF46nGJ3OnruR \
ghc-devel-invariant-0.6.5-DrqO3CbAMrLCl36mqBRofr \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-profunctors-5.6.3-CPqBm5VgzT9DSAiXWxFcrG \
ghc-devel-semigroupoids-6.0.2-B6Y5GIvJ2JI8mXJpMQTJaF \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-kan-extensions"

inherit rpm
