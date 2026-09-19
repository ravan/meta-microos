SUMMARY = "Haskell tar profiling library"
DESCRIPTION = "This package provides the Haskell tar profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.4.0"

RPM_NAME = "ghc-tar-prof-0.6.4.0-4.11.aarch64.rpm"
RPM_HASH = "8c4a348a8311041d7aad7e2fb8263f5bfa6d2935f937e2afb8d343bff4cc0f8b0a7e8edc937ccbb78bdfab4e0fcba3ad379233a2733b9c0b4394d29f1028574b"

RPROVIDES:${PN} += "ghc-tar-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-directory-ospath-streaming-0.2.2-CPCQJecF0zy6ReoJMTKhf9 \
ghc-prof-file-io-0.1.6-8374 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-os-string-2.0.10-5320 \
ghc-prof-time-1.14-a7dc \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-tar-devel"

inherit rpm
