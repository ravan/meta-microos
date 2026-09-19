SUMMARY = "Haskell tar library development files"
DESCRIPTION = "This package provides the Haskell tar library development files."
LICENSE = "BSD-3-Clause"

PV = "0.6.4.0"

RPM_NAME = "ghc-tar-devel-0.6.4.0-4.11.aarch64.rpm"
RPM_HASH = "be32a113b75d066268379dc60ee0f35a18384a1028945df3cba983465229ded00340b7815eeb6759ede8adee054ff7bb5d7ff9de906479a6c2f475fa17254528"

RPROVIDES:${PN} += "ghc-devel-tar-0.6.4.0-9ossRFyAR7eA6S8nUFxzyG \
ghc-tar-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-directory-ospath-streaming-0.2.2-CPCQJecF0zy6ReoJMTKhf9 \
ghc-devel-file-io-0.1.6-8374 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-os-string-2.0.10-5320 \
ghc-devel-time-1.14-a7dc \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-tar"

inherit rpm
