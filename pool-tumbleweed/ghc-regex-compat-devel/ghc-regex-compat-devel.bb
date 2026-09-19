SUMMARY = "Haskell regex-compat library development files"
DESCRIPTION = "This package provides the Haskell regex-compat library development files."
LICENSE = "BSD-3-Clause"

PV = "0.95.2.2"

RPM_NAME = "ghc-regex-compat-devel-0.95.2.2-1.8.aarch64.rpm"
RPM_HASH = "98302b9324af0204b5953ecde61244bc8238a4f336e8fa20bc33fe81bd6451e0fe760b48445452151df94024dd8b4d96a3647d5001f26e6eede6e315836483f3"

RPROVIDES:${PN} += "ghc-devel-regex-compat-0.95.2.2-BPr9re8H6vl1LOIxX40pHj \
ghc-regex-compat-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-regex-base-0.94.0.3-1XPR6520nrRCZPbnaVzsF0 \
ghc-devel-regex-posix-0.96.0.2-ChZqQGTfEDW3V6S9qgLypS \
ghc-regex-compat"

inherit rpm
