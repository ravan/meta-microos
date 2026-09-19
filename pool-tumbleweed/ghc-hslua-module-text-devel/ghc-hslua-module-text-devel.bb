SUMMARY = "Haskell hslua-module-text library development files"
DESCRIPTION = "This package provides the Haskell hslua-module-text library development \
files."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "ghc-hslua-module-text-devel-1.2.0-1.3.aarch64.rpm"
RPM_HASH = "6b0d497016d99e293804b74a4a8a2fbe5537277976cb510aa55601e13b221947f4c02b0a6beb34fc8beaa59568864938031dda8764844da137ddb4701cad74ef"

RPROVIDES:${PN} += "ghc-devel-hslua-module-text-1.2.0-DwjhamFyoyqDccdYnCveaY \
ghc-hslua-module-text-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-devel-hslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o \
ghc-devel-hslua-packaging-2.4.1-1RYRM22n0e3FXJMrP5sdLA \
ghc-devel-text-2.1.4-cf23 \
ghc-hslua-module-text"

inherit rpm
