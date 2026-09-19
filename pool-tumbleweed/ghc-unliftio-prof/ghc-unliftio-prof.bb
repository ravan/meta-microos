SUMMARY = "Haskell unliftio profiling library"
DESCRIPTION = "This package provides the Haskell unliftio profiling library."
LICENSE = "MIT"

PV = "0.2.25.1"

RPM_NAME = "ghc-unliftio-prof-0.2.25.1-1.12.aarch64.rpm"
RPM_HASH = "b97ed7d69cab40bec26dd499312222038463483bc4ffa26811d619c177446f93a1625e9f2f7ef6a1fa17ab81bddb682b8519efca39b823415954a892ec296faf"

RPROVIDES:${PN} += "ghc-prof-unliftio-0.2.25.1-8vIVLEQRNyE8ysD18Y7w9V \
ghc-unliftio-prof"

RDEPENDS:${PN} += "ghc-prof-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-process-1.6.26.1-905d \
ghc-prof-safe-exceptions-0.1.7.4-JhYHKGOjni2BPgULQnbuUS \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-prof-time-1.14-a7dc \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unix-2.8.8.0-178a \
ghc-prof-unliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92 \
ghc-unliftio-devel"

inherit rpm
