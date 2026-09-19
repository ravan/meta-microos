SUMMARY = "Haskell sandi library development files"
DESCRIPTION = "This package provides the Haskell sandi library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-sandi-devel-0.5-5.60.aarch64.rpm"
RPM_HASH = "53cc8d83d5057abe5df7081a1c21b5c8a3a5453a9f7766486c97547476404a9ac02483a990ff94024ffe326a5e9ef10e193d41cc8bdfd298243e6d872a168320"

RPROVIDES:${PN} += "ghc-devel-sandi-0.5-CSReKcZE4oMHyrsoFuQsxn \
ghc-sandi-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-devel-exceptions-0.10.12-f655 \
ghc-sandi"

inherit rpm
