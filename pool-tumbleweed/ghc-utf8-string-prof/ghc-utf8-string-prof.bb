SUMMARY = "Haskell utf8-string profiling library"
DESCRIPTION = "This package provides the Haskell utf8-string profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-utf8-string-prof-1.0.2-2.35.aarch64.rpm"
RPM_HASH = "c318f300fa40f8ea7ee1d04790728c7ae26e7fc34d3806da3cf95e82050d1b660a62f3094b73ada7ad3802220fe89e8a2275aff8ea63c6ec133c2b2a61b8da0c"

RPROVIDES:${PN} += "ghc-prof-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-utf8-string-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-utf8-string-devel"

inherit rpm
