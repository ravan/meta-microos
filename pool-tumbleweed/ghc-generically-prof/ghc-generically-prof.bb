SUMMARY = "Haskell generically profiling library"
DESCRIPTION = "This package provides the Haskell generically profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-generically-prof-0.1.1-6.3.aarch64.rpm"
RPM_HASH = "f08d26f177e109d5311c44cc1af36d936173701c7e4e01968a47630c2dfceda2fad41f93ec35d6554e4a6a040024a3538f68ea6ab7166e785c9844e05cb1e985"

RPROVIDES:${PN} += "ghc-generically-prof \
ghc-prof-generically-0.1.1-KFVlHRUBXRKIFuvobfIRlH"

RDEPENDS:${PN} += "ghc-generically-devel \
ghc-prof-base-4.21.2.0-8844"

inherit rpm
