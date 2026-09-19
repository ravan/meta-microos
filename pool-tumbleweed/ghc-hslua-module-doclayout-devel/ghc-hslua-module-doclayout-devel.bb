SUMMARY = "Haskell hslua-module-doclayout library development files"
DESCRIPTION = "This package provides the Haskell hslua-module-doclayout library \
development files."
LICENSE = "MIT"

PV = "1.2.1.1"

RPM_NAME = "ghc-hslua-module-doclayout-devel-1.2.1.1-1.2.aarch64.rpm"
RPM_HASH = "ad78dea639f8e448d457a13db83b3fe89fd1fd8b82b878b0cef8387492d2e07080a194dc626d9c9be3cbde8987a6452b375d2e2d7a97dab74a43863eb836e433"

RPROVIDES:${PN} += "ghc-devel-hslua-module-doclayout-1.2.1.1-Eyz3o1BKBTfIuJk50WY6Na \
ghc-hslua-module-doclayout-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-doclayout-0.5.0.3-6oU5Og9jiD67xwlm4qJ1ii \
ghc-devel-hslua-2.5.0-EJ5RjGxg4AI6GL8E9HKZKp \
ghc-devel-text-2.1.4-cf23 \
ghc-hslua-module-doclayout"

inherit rpm
