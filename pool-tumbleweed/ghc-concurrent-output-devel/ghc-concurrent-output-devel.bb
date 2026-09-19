SUMMARY = "Haskell concurrent-output library development files"
DESCRIPTION = "This package provides the Haskell concurrent-output library development \
files."
LICENSE = "BSD-2-Clause"

PV = "1.10.21"

RPM_NAME = "ghc-concurrent-output-devel-1.10.21-1.29.aarch64.rpm"
RPM_HASH = "7a03903e5c6eb4a9d9b3908c34552f66e7f026eabfde3d2026a984b2094d69f88f2c6854133f82c11a0b3cd099db6951c028b5b70e306f62169baaf3d1b36bec"

RPROVIDES:${PN} += "ghc-concurrent-output-devel \
ghc-devel-concurrent-output-1.10.21-Lr5KfTnjaSRGW66ZQE3au1"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-concurrent-output \
ghc-devel-ansi-terminal-1.1.5-KiVHPj6W9e81bxE9dBsVtZ \
ghc-devel-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-process-1.6.26.1-905d \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-devel-terminal-size-0.3.4-KpiFCzVajgTH7fY18MNMyf \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unix-2.8.8.0-178a"

inherit rpm
