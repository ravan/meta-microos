SUMMARY = "Haskell regex-base profiling library"
DESCRIPTION = "This package provides the Haskell regex-base profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.94.0.3"

RPM_NAME = "ghc-regex-base-prof-0.94.0.3-1.12.aarch64.rpm"
RPM_HASH = "e656550a3395004b882971bc892098600bcdc00e62032adb8824a929905000b673543e4bbd7215988122a8b27a48519dfa954baf704431cfe5681712481db492"

RPROVIDES:${PN} += "ghc-prof-regex-base-0.94.0.3-1XPR6520nrRCZPbnaVzsF0 \
ghc-regex-base-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-text-2.1.4-cf23 \
ghc-regex-base-devel"

inherit rpm
