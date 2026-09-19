SUMMARY = "Haskell ipynb profiling library"
DESCRIPTION = "This package provides the Haskell ipynb profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "ghc-ipynb-prof-0.2-2.58.aarch64.rpm"
RPM_HASH = "8237d308391e75d241a56cef760df6d1d147cc121eeff9e65fccb2132bc86dd4735f3ba5970d0b17b2feb730df781f70d3184ca5b42422ea7a5281dbbadc2bd9"

RPROVIDES:${PN} += "ghc-ipynb-prof \
ghc-prof-ipynb-0.2-FFISJjoqmq33DtDQybniaE"

RDEPENDS:${PN} += "ghc-ipynb-devel \
ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu"

inherit rpm
