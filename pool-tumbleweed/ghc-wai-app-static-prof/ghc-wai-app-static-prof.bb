SUMMARY = "Haskell wai-app-static profiling library"
DESCRIPTION = "This package provides the Haskell wai-app-static profiling library."
LICENSE = "MIT"

PV = "3.1.9.1"

RPM_NAME = "ghc-wai-app-static-prof-3.1.9.1-1.6.aarch64.rpm"
RPM_HASH = "d152ccd180f6c35b411cdc0d7267d7f3437520cd6b7eed1efda4687e01111e17c279c53fab2a09dd46f9caf9727b9353f96af927df9b001431ae975aab795cf9"

RPROVIDES:${PN} += "ghc-prof-wai-app-static-3.1.9.1-79h1qWsU2OJ8maZZtyFIQX \
ghc-wai-app-static-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-prof-blaze-html-0.9.2.0-93B80xR5emg3yG3V6J7j6o \
ghc-prof-blaze-markup-0.8.3.0-K4FwMBPUUgu9TB66ALCxf7 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-cryptohash-md5-0.11.101.0-BL71FgcwkvtHLdWrK6WsDS \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-file-embed-0.0.16.0-JqsWezc6wrB9rh480YKWnn \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-http-date-0.0.11-6QGoEWt5iWVBVu6inZxd9J \
ghc-prof-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-prof-mime-types-0.1.2.2-6XnqAsimqz1GLkPrdggNkp \
ghc-prof-old-locale-1.0.0.7-DplRrAcnBM96ijBftoXSc5 \
ghc-prof-optparse-applicative-0.19.0.0-GyrRSLDSSh1GQCxnTYbnDq \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-time-1.14-a7dc \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unix-compat-0.7.4.1-4v781Gok1KY8Kg7jV1j1vn \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-prof-wai-3.2.4-Is1UVC1czjX2cAufnl3tJW \
ghc-prof-wai-extra-3.1.18-ITQet8OpxGX98ABokzjnL2 \
ghc-prof-warp-3.4.9-4LBlVKyJZyS6kjQUEE5DAG \
ghc-prof-zlib-0.7.1.1-9wvDfX7JlnE99sTdZLYOpU \
ghc-wai-app-static-devel"

inherit rpm
