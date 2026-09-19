SUMMARY = "Haskell void library development files"
DESCRIPTION = "This package provides the Haskell void library development files."
LICENSE = "BSD-3-Clause"

PV = "0.7.4"

RPM_NAME = "ghc-void-devel-0.7.4-1.7.aarch64.rpm"
RPM_HASH = "d9cc23a428cacb859d1b0038f000f68287f9629142a783df42c424e4f67cbfa75b2baa2d1c28409fb4938656be71bd050bb322c4de95e0249f92f8ce43b70c3c"

RPROVIDES:${PN} += "ghc-devel-void-0.7.4-18r3xgdXbMHk4AqCF5SgT \
ghc-void-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-void"

inherit rpm
