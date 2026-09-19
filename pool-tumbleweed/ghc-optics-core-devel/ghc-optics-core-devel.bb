SUMMARY = "Haskell optics-core library development files"
DESCRIPTION = "This package provides the Haskell optics-core library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.2"

RPM_NAME = "ghc-optics-core-devel-0.4.2-1.3.aarch64.rpm"
RPM_HASH = "b2891ebe88617e521c0395a0c561f171c08555a8e0ab80537226544cbe86f1f8ab7bfea6e9ee46d999f7cdb74a4b5d8dcc442bbc58e59bfda60b0a670a53459c"

RPROVIDES:${PN} += "ghc-devel-optics-core-0.4.2-7BE8gBXEGOAKzvacYKREXy \
ghc-optics-core-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-indexed-profunctors-0.1.1.1-HSqEhDrwiQJ27Hm9NjzenO \
ghc-devel-indexed-traversable-0.1.5-JylwuAInS9n4ImeZ4JChDW \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-optics-core"

inherit rpm
