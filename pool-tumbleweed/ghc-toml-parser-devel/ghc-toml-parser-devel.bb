SUMMARY = "Haskell toml-parser library development files"
DESCRIPTION = "This package provides the Haskell toml-parser library development files."
LICENSE = "ISC"

PV = "2.0.2.0"

RPM_NAME = "ghc-toml-parser-devel-2.0.2.0-2.3.aarch64.rpm"
RPM_HASH = "db22befc58f38da0daf759256498160801d04fad547d19549ea43014396196f182e773f7479e2f19ccd3743ecc056039169e2de79393e6918879aa95b769af5c"

RPROVIDES:${PN} += "ghc-devel-toml-parser-2.0.2.0-5orbE5KlUlGF8qGuEq1R69 \
ghc-toml-parser-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-prettyprinter-1.7.2-I8Z9oIqYCiwIS8uRvukUd0 \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-time-1.14-a7dc \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-toml-parser"

inherit rpm
