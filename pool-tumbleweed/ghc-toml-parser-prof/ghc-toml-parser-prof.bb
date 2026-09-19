SUMMARY = "Haskell toml-parser profiling library"
DESCRIPTION = "This package provides the Haskell toml-parser profiling library."
LICENSE = "ISC"

PV = "2.0.2.0"

RPM_NAME = "ghc-toml-parser-prof-2.0.2.0-2.3.aarch64.rpm"
RPM_HASH = "89f4fa14947c89a1276b4fa348d27cae80b76c19ee88b9620319a4b4ba0dc9504c696884aecd413d28f52b85ae88933d0605f26b9d5e798bb9f2449f0133496c"

RPROVIDES:${PN} += "ghc-prof-toml-parser-2.0.2.0-5orbE5KlUlGF8qGuEq1R69 \
ghc-toml-parser-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-prettyprinter-1.7.2-I8Z9oIqYCiwIS8uRvukUd0 \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-time-1.14-a7dc \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-toml-parser-devel"

inherit rpm
