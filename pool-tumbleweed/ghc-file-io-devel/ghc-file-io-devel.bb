SUMMARY = "Haskell file-io library development files"
DESCRIPTION = "This package provides the Haskell file-io library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "ghc-file-io-devel-0.1.6-1.3.aarch64.rpm"
RPM_HASH = "9648c1ca0879f3998a695299274f8a7a9b402d48c0ac4d6c0575352f5ac24fdf2e6fa0cd5970b6f8f3ebd6111d039aff85b6404fede4a679844ecfaa54da9ac8"

RPROVIDES:${PN} += "ghc-devel-file-io-0.1.6-8374 \
ghc-file-io-devel \
ghc-file-io-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-os-string-2.0.10-5320 \
ghc-devel-unix-2.8.8.0-178a \
ghc-file-io"

inherit rpm
