SUMMARY = "Haskell xml library development files"
DESCRIPTION = "This package provides the Haskell xml library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.14"

RPM_NAME = "ghc-xml-devel-1.3.14-13.32.aarch64.rpm"
RPM_HASH = "04600f0985c108a666cf84f1b75f7e527e8b804a9cfaf4f74000ad7402613c3a6b24a46c17a65121af5156341781183dd59b37e01d342b813bbb5c092b5535f4"

RPROVIDES:${PN} += "ghc-devel-xml-1.3.14-JuCOsTtMISWPxn2nU4HVl \
ghc-xml-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-text-2.1.4-cf23 \
ghc-xml"

inherit rpm
