SUMMARY = "Haskell cairo profiling library"
DESCRIPTION = "This package provides the Haskell cairo profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.13.12.0"

RPM_NAME = "ghc-cairo-prof-0.13.12.0-1.12.aarch64.rpm"
RPM_HASH = "a8aabfb67110d81d1d819965389d5d46c9dbbc43b24ba43185a100f67a520ba7258527ce07536c7dfff5d20655c3466a1856327ebf989d4ac948599fcbd4a23b"

RPROVIDES:${PN} += "ghc-cairo-prof \
ghc-prof-cairo-0.13.12.0-4t6EsC3Gqxb9Xow3SHIyd2"

RDEPENDS:${PN} += "ghc-cairo-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG"

inherit rpm
