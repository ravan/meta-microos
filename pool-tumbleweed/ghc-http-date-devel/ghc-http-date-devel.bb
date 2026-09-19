SUMMARY = "Haskell http-date library development files"
DESCRIPTION = "This package provides the Haskell http-date library development files."
LICENSE = "BSD-3-Clause"

PV = "0.0.11"

RPM_NAME = "ghc-http-date-devel-0.0.11-2.40.aarch64.rpm"
RPM_HASH = "d081a6c756af393b7746f0886fb5eb3152b0865063006a41c581ac2a305410f4bf88ac70c368ae3749554f2fb82a686157cc9781b8c02179acf93dc1b770c0db"

RPROVIDES:${PN} += "ghc-devel-http-date-0.0.11-6QGoEWt5iWVBVu6inZxd9J \
ghc-http-date-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-time-1.14-a7dc \
ghc-http-date"

inherit rpm
