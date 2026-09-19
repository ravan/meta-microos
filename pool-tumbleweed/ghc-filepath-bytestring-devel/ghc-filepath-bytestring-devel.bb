SUMMARY = "Haskell filepath-bytestring library development files"
DESCRIPTION = "This package provides the Haskell filepath-bytestring library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.5.2.0.5"

RPM_NAME = "ghc-filepath-bytestring-devel-1.5.2.0.5-1.3.aarch64.rpm"
RPM_HASH = "0ca8a40d8ba0e95600bf09b3ae55f2da6fbc3658e630332c8f3dddb3a81dce8b2a0f84bd99183ac269b4870dd112b504355692088671c2af8c89a385322ca4bc"

RPROVIDES:${PN} += "ghc-devel-filepath-bytestring-1.5.2.0.5-91PzjYWe6JYJhPT4RGVSOc \
ghc-filepath-bytestring-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-unix-2.8.8.0-178a \
ghc-filepath-bytestring"

inherit rpm
