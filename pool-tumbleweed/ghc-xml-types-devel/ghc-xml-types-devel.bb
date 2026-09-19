SUMMARY = "Haskell xml-types library development files"
DESCRIPTION = "This package provides the Haskell xml-types library development files."
LICENSE = "MIT"

PV = "0.3.8"

RPM_NAME = "ghc-xml-types-devel-0.3.8-4.23.aarch64.rpm"
RPM_HASH = "2bfdb5f8c58639efb8120587c2b521b66dde0c213d31d07eab97dcf17e89a45bac4e08eab2e3abbd054cba86abd9020aa14d38811cff10ef331b0e139300986f"

RPROVIDES:${PN} += "ghc-devel-xml-types-0.3.8-35OA2z37X8M4UCRyGooeYw \
ghc-xml-types-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-text-2.1.4-cf23 \
ghc-xml-types"

inherit rpm
