SUMMARY = "Haskell hslua-list profiling library"
DESCRIPTION = "This package provides the Haskell hslua-list profiling library."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "ghc-hslua-list-prof-1.1.4-1.13.aarch64.rpm"
RPM_HASH = "c069ee01220162cb08b9cd2f5606488097a4b4c36b5912b7c134e3ccea6b2115cd9bcacc65c748b43ea25063fac805ca9db789f16428e12743be4afb95bcae60"

RPROVIDES:${PN} += "ghc-hslua-list-prof \
ghc-prof-hslua-list-1.1.4-2iYtswPM1Oh6QVQjUY3AZP"

RDEPENDS:${PN} += "ghc-hslua-list-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr"

inherit rpm
