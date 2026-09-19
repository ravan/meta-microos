SUMMARY = "Haskell recv library development files"
DESCRIPTION = "This package provides the Haskell recv library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-recv-devel-0.1.1-1.8.aarch64.rpm"
RPM_HASH = "f732fe4856b7528818e83154fc5d7633446ab329da76bc88ea0b763e7c53bbc58715b0eb4bbd52553798a98ceadbb6693ce40e2cc948d54d635a6e07c6730ad0"

RPROVIDES:${PN} += "ghc-devel-recv-0.1.1-9tN4UPJrbcvHykqBUpm2ul \
ghc-recv-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-recv"

inherit rpm
