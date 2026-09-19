SUMMARY = "Haskell ShellCheck library development files"
DESCRIPTION = "This package provides the Haskell ShellCheck library development files."
LICENSE = "GPL-3.0-or-later"

PV = "0.11.0"

RPM_NAME = "ghc-ShellCheck-devel-0.11.0-1.3.aarch64.rpm"
RPM_HASH = "3b88b78ccbfc09c611a5fff092bc389d40b9066ac614f8a3aa9060f3084f65f6344f8a76bd76dda2f2f5307d3d9573fb895d48651109d49a4fc9472e2bfad51e"

RPROVIDES:${PN} += "ghc-ShellCheck-devel \
ghc-devel-ShellCheck-0.11.0-9WjU3BJUXC1EFIs8EzczE8"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-ShellCheck \
ghc-compiler \
ghc-devel-Diff-1.0.2-5PTxq8P0tjM13opDjMQ0ap \
ghc-devel-QuickCheck-2.15.0.1-BiJUyvfspYF6JuhHRqpj7J \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-fgl-5.8.3.1-7WeyqbkdcX2Klu3tCAsWkr \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-devel-process-1.6.26.1-905d \
ghc-devel-regex-tdfa-1.3.2.5-DS5gfI36p0L6e0JJtc3gfd \
ghc-devel-transformers-0.6.3.0-4709"

inherit rpm
