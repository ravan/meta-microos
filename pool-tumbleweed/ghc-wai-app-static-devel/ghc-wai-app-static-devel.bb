SUMMARY = "Haskell wai-app-static library development files"
DESCRIPTION = "This package provides the Haskell wai-app-static library development files."
LICENSE = "MIT"

PV = "3.1.9.1"

RPM_NAME = "ghc-wai-app-static-devel-3.1.9.1-1.6.aarch64.rpm"
RPM_HASH = "b2c751fa805c42f38992c323af00e38189ad0f54fe7e5561628caa77b8c39013d8f977250ba52b0c7fee762be4d83fb96932589661af840f0094a5c75895cd8f"

RPROVIDES:${PN} += "ghc-devel-wai-app-static-3.1.9.1-79h1qWsU2OJ8maZZtyFIQX \
ghc-wai-app-static-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-devel-blaze-html-0.9.2.0-93B80xR5emg3yG3V6J7j6o \
ghc-devel-blaze-markup-0.8.3.0-K4FwMBPUUgu9TB66ALCxf7 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-cryptohash-md5-0.11.101.0-BL71FgcwkvtHLdWrK6WsDS \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-file-embed-0.0.16.0-JqsWezc6wrB9rh480YKWnn \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-http-date-0.0.11-6QGoEWt5iWVBVu6inZxd9J \
ghc-devel-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-devel-mime-types-0.1.2.2-6XnqAsimqz1GLkPrdggNkp \
ghc-devel-old-locale-1.0.0.7-DplRrAcnBM96ijBftoXSc5 \
ghc-devel-optparse-applicative-0.19.0.0-GyrRSLDSSh1GQCxnTYbnDq \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-time-1.14-a7dc \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unix-compat-0.7.4.1-4v781Gok1KY8Kg7jV1j1vn \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-devel-wai-3.2.4-Is1UVC1czjX2cAufnl3tJW \
ghc-devel-wai-extra-3.1.18-ITQet8OpxGX98ABokzjnL2 \
ghc-devel-warp-3.4.9-4LBlVKyJZyS6kjQUEE5DAG \
ghc-devel-zlib-0.7.1.1-9wvDfX7JlnE99sTdZLYOpU \
ghc-wai-app-static"

inherit rpm
