SUMMARY = "Haskell disk-free-space library development files"
DESCRIPTION = "This package provides the Haskell disk-free-space library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.1"

RPM_NAME = "ghc-disk-free-space-devel-0.1.0.1-5.23.aarch64.rpm"
RPM_HASH = "b93785fc92dbd1b69ad9aef1205807d546496940c48defbe29785ea8c22c4d7d9135618c14ab6fcb0c93a75ee533000cf31c689f50991d8f4b05eca8d35cb150"

RPROVIDES:${PN} += "ghc-devel-disk-free-space-0.1.0.1-CwfKSebfOn7JGVRYHaYrKk \
ghc-disk-free-space-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-disk-free-space"

inherit rpm
