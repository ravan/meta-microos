SUMMARY = "Haskell safe-exceptions profiling library"
DESCRIPTION = "This package provides the Haskell safe-exceptions profiling library."
LICENSE = "MIT"

PV = "0.1.7.4"

RPM_NAME = "ghc-safe-exceptions-prof-0.1.7.4-2.21.aarch64.rpm"
RPM_HASH = "fcef8a7315ad3e6740e91943eebeb40061aa7360f6db57a128f43478f85654c8da33625c3ee85299ce672fcb83e7dc02b491f50c5d930c8f69e39e807cc2368c"

RPROVIDES:${PN} += "ghc-prof-safe-exceptions-0.1.7.4-JhYHKGOjni2BPgULQnbuUS \
ghc-safe-exceptions-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-safe-exceptions-devel"

inherit rpm
