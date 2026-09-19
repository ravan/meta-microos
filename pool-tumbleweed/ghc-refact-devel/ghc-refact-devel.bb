SUMMARY = "Haskell refact library development files"
DESCRIPTION = "This package provides the Haskell refact library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.0.2"

RPM_NAME = "ghc-refact-devel-0.3.0.2-4.19.aarch64.rpm"
RPM_HASH = "3002d85ffdf9b01d54f883a2ccfa1f031af83589081896cecc3ebf84cfe66f94f1211a9765022e28f38fe78427a41a0599b0c27297486db5c6d2a607cb796c1d"

RPROVIDES:${PN} += "ghc-devel-refact-0.3.0.2-BbwdNckJT1UJcRbLtga6Lt \
ghc-refact-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-refact"

inherit rpm
