SUMMARY = "Haskell tabular library development files"
DESCRIPTION = "This package provides the Haskell tabular library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.8"

RPM_NAME = "ghc-tabular-devel-0.2.2.8-4.31.aarch64.rpm"
RPM_HASH = "ddc0c680dcc37ad348cdc7010e8b1a04528fed7d68cd52716d610ed26ae90b9cd939e28c841da330df60b94699eef5880a5f0088dc06784e5d915b61d6aa75f6"

RPROVIDES:${PN} += "ghc-devel-tabular-0.2.2.8-ICV0buHy8xI197ojnqVjgg \
ghc-tabular-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-csv-0.1.2-3wV9bBF7sWG7h8WLMiwYq8 \
ghc-devel-html-1.0.1.2-47pIZc0gzI25DOiguxUrYX \
ghc-devel-mtl-2.3.2-37ef \
ghc-tabular"

inherit rpm
