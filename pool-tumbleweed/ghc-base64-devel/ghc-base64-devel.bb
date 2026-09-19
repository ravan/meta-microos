SUMMARY = "Haskell base64 library development files"
DESCRIPTION = "This package provides the Haskell base64 library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "ghc-base64-devel-1.0-1.3.aarch64.rpm"
RPM_HASH = "3c3d16b858a56ceae0d9022c22f7c6d13d3a242b30303ce00460627430a65a434ee662bdadab7661bea4394160a124019d460d3a21eae993c18127724c29b617"

RPROVIDES:${PN} += "ghc-base64-devel \
ghc-devel-base64-1.0-Ca310PwaD9pGmjzA3S4jr6"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-base64 \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-text-short-0.1.6.1-K3gVAGEPLemvxyg6g1yq"

inherit rpm
