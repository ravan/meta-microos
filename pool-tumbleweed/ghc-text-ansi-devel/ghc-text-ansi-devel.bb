SUMMARY = "Haskell text-ansi library development files"
DESCRIPTION = "This package provides the Haskell text-ansi library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.0.1"

RPM_NAME = "ghc-text-ansi-devel-0.3.0.1-4.2.aarch64.rpm"
RPM_HASH = "4f9373bcd6833d32312c4c3619c9ec9d8dedfafeae919124edee2dc00f850116e5b8fbc99854669fdfbf63c610ff65a43133a045e9dff2627139ae7f543cd068"

RPROVIDES:${PN} += "ghc-devel-text-ansi-0.3.0.1-VLtME1OTfL3OjlqJPcyHR \
ghc-text-ansi-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-text-builder-linear-0.1.3-2ecVyAm1DTtJbSvV9ASpSh \
ghc-text-ansi"

inherit rpm
