SUMMARY = "Haskell directory-ospath-streaming library development files"
DESCRIPTION = "This package provides the Haskell directory-ospath-streaming library \
development files."
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "ghc-directory-ospath-streaming-devel-0.2.2-2.11.aarch64.rpm"
RPM_HASH = "eaede8ec41e7d21bdbf1aed3925c709c855cfecebcf81e5f88bd9a651e2f9fa6d88cc406b1c84fde1e22c03602d35783611ba3cbf0c5afa390f519ae312e7324"

RPROVIDES:${PN} += "ghc-devel-directory-ospath-streaming-0.2.2-CPCQJecF0zy6ReoJMTKhf9 \
ghc-directory-ospath-streaming-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-atomic-counter-0.1.2.4-K5650WCkbBZIqAcUX7ixZ6 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-os-string-2.0.10-5320 \
ghc-devel-unix-2.8.8.0-178a \
ghc-directory-ospath-streaming"

inherit rpm
