SUMMARY = "Haskell filepattern library development files"
DESCRIPTION = "This package provides the Haskell filepattern library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-filepattern-devel-0.1.3-2.36.aarch64.rpm"
RPM_HASH = "7dde3d4885b9bc29f1139efa816abbe5b2e8a3fabf901a8e3de341abc7284eafb0cf252c1300d736674187a4ebbe1c153e2b1907eba39688929e582c233f79f5"

RPROVIDES:${PN} += "ghc-devel-filepattern-0.1.3-KZHQp0sesewHup360RGBuM \
ghc-filepattern-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-extra-1.8.1-J47FlDu75Mb8OlFkJuPlkW \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-filepattern"

inherit rpm
