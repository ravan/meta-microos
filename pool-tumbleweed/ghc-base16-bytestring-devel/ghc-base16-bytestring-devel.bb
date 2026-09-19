SUMMARY = "Haskell base16-bytestring library development files"
DESCRIPTION = "This package provides the Haskell base16-bytestring library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.0.2.0"

RPM_NAME = "ghc-base16-bytestring-devel-1.0.2.0-3.21.aarch64.rpm"
RPM_HASH = "6205a718badb226df1502e6240179070ca0b88228bee75dfd76c7338c48489c4414a046a6cafb3c8c494d8b476223133ad369c039de561768341e99513a19781"

RPROVIDES:${PN} += "ghc-base16-bytestring-devel \
ghc-devel-base16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-base16-bytestring \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be"

inherit rpm
