SUMMARY = "Haskell base-compat library development files"
DESCRIPTION = "This package provides the Haskell base-compat library development files."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "ghc-base-compat-devel-0.14.1-1.15.aarch64.rpm"
RPM_HASH = "d41dbf21e59b44cf7994dce91f3523bfb5762947a0a04304c6360edd7b08873511752106b7fccbbbda07d885e6395fb522e7767a43cde3b6a94796801c544ad8"

RPROVIDES:${PN} += "ghc-base-compat-devel \
ghc-devel-base-compat-0.14.1-KqldihVKqBMDOTSpHrHMJy"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-base-compat \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-devel-unix-2.8.8.0-178a"

inherit rpm
