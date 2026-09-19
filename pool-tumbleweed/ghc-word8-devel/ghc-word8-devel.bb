SUMMARY = "Haskell word8 library development files"
DESCRIPTION = "This package provides the Haskell word8 library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-word8-devel-0.1.3-5.35.aarch64.rpm"
RPM_HASH = "e5cdcde4768bf2d74385ac8e713f5dd2ec40d3969fdeb093697d30ce789f95b7374bb9fa7d58154956b4befb3d3f2e0efb1cc70725cb556260f293d7b2334896"

RPROVIDES:${PN} += "ghc-devel-word8-0.1.3-DJye6up9iU5LN32ihJcMva \
ghc-word8-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-word8"

inherit rpm
