SUMMARY = "Haskell data-default library development files"
DESCRIPTION = "This package provides the Haskell data-default library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.0.2"

RPM_NAME = "ghc-data-default-devel-0.8.0.2-1.3.aarch64.rpm"
RPM_HASH = "852c272d364c6f6e33032e2bb2e62892d2e263bedea3aee4cff4c6cf37ca5980a5fdf362da4e83d62caa8196d4585d209b178607c9fdd204d19f0c173ce52fb7"

RPROVIDES:${PN} += "ghc-data-default-devel \
ghc-devel-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-data-default \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1"

inherit rpm
