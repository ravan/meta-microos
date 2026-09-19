SUMMARY = "Haskell blaze-markup profiling library"
DESCRIPTION = "This package provides the Haskell blaze-markup profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.3.0"

RPM_NAME = "ghc-blaze-markup-prof-0.8.3.0-3.21.aarch64.rpm"
RPM_HASH = "863d9397e35a78961559cb334650966dc8c43d4db77029a0934d653a16abb90753590b61d532b42ea6b39965afffa810d7caa8b0a55fa142d99f71e43cd97c4d"

RPROVIDES:${PN} += "ghc-blaze-markup-prof \
ghc-prof-blaze-markup-0.8.3.0-K4FwMBPUUgu9TB66ALCxf7"

RDEPENDS:${PN} += "ghc-blaze-markup-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-blaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-text-2.1.4-cf23"

inherit rpm
