SUMMARY = "Haskell regex-compat profiling library"
DESCRIPTION = "This package provides the Haskell regex-compat profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.95.2.2"

RPM_NAME = "ghc-regex-compat-prof-0.95.2.2-1.8.aarch64.rpm"
RPM_HASH = "e639e24cdb628c6258a56895aff2477cc130180b302ccaed40abe91a70263b2b7523fae4e519ca0d5045dc03fbf64f36c67921e782865564517b08ba6a43f463"

RPROVIDES:${PN} += "ghc-prof-regex-compat-0.95.2.2-BPr9re8H6vl1LOIxX40pHj \
ghc-regex-compat-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-regex-base-0.94.0.3-1XPR6520nrRCZPbnaVzsF0 \
ghc-prof-regex-posix-0.96.0.2-ChZqQGTfEDW3V6S9qgLypS \
ghc-regex-compat-devel"

inherit rpm
