SUMMARY = "Haskell kan-extensions profiling library"
DESCRIPTION = "This package provides the Haskell kan-extensions profiling library."
LICENSE = "BSD-3-Clause"

PV = "5.2.8"

RPM_NAME = "ghc-kan-extensions-prof-5.2.8-1.3.aarch64.rpm"
RPM_HASH = "d124d7a30cf0d3a5c7d9f6dbd7961b5c3bd445f8e727c6db160ef1b6758409c215eac4f34490488581c40ae0ae79a6e9025528cabe3e3b0db1ac266cb6345bcf"

RPROVIDES:${PN} += "ghc-kan-extensions-prof \
ghc-prof-kan-extensions-5.2.8-BhPXqlF7GPZ4azZSK3TJ3I"

RDEPENDS:${PN} += "ghc-kan-extensions-devel \
ghc-prof-adjunctions-4.4.4-4nqsP3yaf6U1iY0vApuE6e \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-comonad-5.0.10-Adp50yscRn74SK6wUdL7QP \
ghc-prof-contravariant-1.5.6-7FVTzec2jegEwzkeRkQOi4 \
ghc-prof-distributive-0.6.3-9lg1Hxwh2KlJVxh3zQCgyL \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-free-5.2-4eWU5ydqIMF46nGJ3OnruR \
ghc-prof-invariant-0.6.5-DrqO3CbAMrLCl36mqBRofr \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-profunctors-5.6.3-CPqBm5VgzT9DSAiXWxFcrG \
ghc-prof-semigroupoids-6.0.2-B6Y5GIvJ2JI8mXJpMQTJaF \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
