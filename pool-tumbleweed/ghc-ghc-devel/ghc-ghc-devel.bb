SUMMARY = "Haskell ghc library development files"
DESCRIPTION = "This package provides the Haskell ghc library development files."
LICENSE = "BSD-3-Clause"

PV = "9.12.4"

RPM_NAME = "ghc-ghc-devel-9.12.4-1.3.aarch64.rpm"
RPM_HASH = "e8e77e9392109873ea0552ce05ba37e98ce8b800bacbe06ea1321c00f2b0de776ac5670d29f4b4b84b2cc9d1e614c3c714a4febe750ed5960de6be54ff2292db"

RPROVIDES:${PN} += "ghc-devel-ghc-9.12.4-ced2 \
ghc-ghc-devel \
ghc-ghc-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-ghc-boot-9.12.4-a5b3 \
ghc-devel-ghc-boot-th-9.12.4-0605 \
ghc-devel-ghc-heap-9.12.4-167c \
ghc-devel-ghci-9.12.4-0749 \
ghc-devel-hpc-0.7.0.2-1e89 \
ghc-devel-os-string-2.0.10-5320 \
ghc-devel-process-1.6.26.1-905d \
ghc-devel-rts-1.0.3 \
ghc-devel-semaphore-compat-1.0.0-cc95 \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-devel-time-1.14-a7dc \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unix-2.8.8.0-178a \
ghc-ghc"

inherit rpm
