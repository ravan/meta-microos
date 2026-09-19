SUMMARY = "Haskell encoding library development files"
DESCRIPTION = "This package provides the Haskell encoding library development files."
LICENSE = "BSD-3-Clause"

PV = "0.10.3"

RPM_NAME = "ghc-encoding-devel-0.10.3-1.3.aarch64.rpm"
RPM_HASH = "9eb96ad9fa3e66f35403a3e1695e9102fbd9ebae3ac9ce197d8f82026e668d74c0622cfd5612743ba67ad51014d34a843f43a12713e4ce324dfba14ee6282a02"

RPROVIDES:${PN} += "ghc-devel-encoding-0.10.3-AvKSpiZHZdhEtvUKaxdqNC \
ghc-encoding-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-regex-compat-0.95.2.2-BPr9re8H6vl1LOIxX40pHj \
ghc-encoding"

inherit rpm
