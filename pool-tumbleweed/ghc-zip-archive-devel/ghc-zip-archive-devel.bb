SUMMARY = "Haskell zip-archive library development files"
DESCRIPTION = "This package provides the Haskell zip-archive library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.3.2"

RPM_NAME = "ghc-zip-archive-devel-0.4.3.2-2.17.aarch64.rpm"
RPM_HASH = "55b3d6ea108259ca974654301cc6ed16009cc448f318db90e95e27b4e5537772e9b749eaf84a550ac1c9e96b766a1c46aad2d3e4b03ccd19f970e1ee16380289"

RPROVIDES:${PN} += "ghc-devel-zip-archive-0.4.3.2-7LOPKgQ3Ei9AA5FjkJE7vc \
ghc-zip-archive-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-digest-0.0.2.1-KdJahDzYM113RUTsWm7UXN \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-pretty-1.1.3.6-b7fd \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-time-1.14-a7dc \
ghc-devel-unix-2.8.8.0-178a \
ghc-devel-zlib-0.7.1.1-9wvDfX7JlnE99sTdZLYOpU \
ghc-zip-archive"

inherit rpm
