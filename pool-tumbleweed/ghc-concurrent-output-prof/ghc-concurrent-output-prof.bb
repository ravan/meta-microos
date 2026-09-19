SUMMARY = "Haskell concurrent-output profiling library"
DESCRIPTION = "This package provides the Haskell concurrent-output profiling library."
LICENSE = "BSD-2-Clause"

PV = "1.10.21"

RPM_NAME = "ghc-concurrent-output-prof-1.10.21-1.29.aarch64.rpm"
RPM_HASH = "f61cb1704c5741be7f4de4637eb2c2201237e786e7de19e85f7f7eb3db3b5b849fb758dbe34a4a97c5b1f2a1e15868d35aa389a8186e32816e1327e290c06756"

RPROVIDES:${PN} += "ghc-concurrent-output-prof \
ghc-prof-concurrent-output-1.10.21-Lr5KfTnjaSRGW66ZQE3au1"

RDEPENDS:${PN} += "ghc-concurrent-output-devel \
ghc-prof-ansi-terminal-1.1.5-KiVHPj6W9e81bxE9dBsVtZ \
ghc-prof-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-process-1.6.26.1-905d \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-prof-terminal-size-0.3.4-KpiFCzVajgTH7fY18MNMyf \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unix-2.8.8.0-178a"

inherit rpm
