SUMMARY = "Haskell timeit profiling library"
DESCRIPTION = "This package provides the Haskell timeit profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "ghc-timeit-prof-2.0-6.19.aarch64.rpm"
RPM_HASH = "683c896afa88a51f4f2c3aef4a48e35a9461930745c4691bf6a03f20e93e41262dc1bc0b2213c6a4580bfdf2bcb2bfd6220a16cc81fca3cd1bc35dbb2c3e1d98"

RPROVIDES:${PN} += "ghc-prof-timeit-2.0-3tAgGDzIoCu1cNsnFuFQeC \
ghc-timeit-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-timeit-devel"

inherit rpm
