SUMMARY = "Haskell mountpoints library development files"
DESCRIPTION = "This package provides the Haskell mountpoints library development files."
LICENSE = "LGPL-2.1-or-later & BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-mountpoints-devel-1.0.2-4.24.aarch64.rpm"
RPM_HASH = "b57d5ce52ffd9f37dd12bcef302583c916ee6ef39720e788f101a3909928e9f48fdd0ea5361dff93e196dd198fce54ea833bcc308826825715ed3c8766b51a5c"

RPROVIDES:${PN} += "ghc-devel-mountpoints-1.0.2-35WJHyDVhGJG15R347ykZV \
ghc-mountpoints-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-mountpoints"

inherit rpm
