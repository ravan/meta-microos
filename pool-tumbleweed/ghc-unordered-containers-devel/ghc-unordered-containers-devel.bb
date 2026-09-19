SUMMARY = "Haskell unordered-containers library development files"
DESCRIPTION = "This package provides the Haskell unordered-containers library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.21"

RPM_NAME = "ghc-unordered-containers-devel-0.2.21-2.3.aarch64.rpm"
RPM_HASH = "cabea3f2c935480f51a6c3a2c8255f449eaaf920de7a7608b3c43375eb4da08dc9b8f7a5353cff98cd64253b88ff7918ef0093169cb3e5aa6385cb5b76a9191b"

RPROVIDES:${PN} += "ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-unordered-containers-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-unordered-containers"

inherit rpm
