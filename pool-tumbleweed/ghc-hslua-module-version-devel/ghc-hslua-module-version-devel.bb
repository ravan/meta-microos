SUMMARY = "Haskell hslua-module-version library development files"
DESCRIPTION = "This package provides the Haskell hslua-module-version library development \
files."
LICENSE = "MIT"

PV = "1.2.0.1"

RPM_NAME = "ghc-hslua-module-version-devel-1.2.0.1-1.2.aarch64.rpm"
RPM_HASH = "e936dc1b1bbe6b2c2ce5bb30f03e4bb75fa4bcb1116e7f58999e6cdfb48bd9ea7cf3bd0ab8de6d1fe721ea961d10a25cc266ce1245e05afdeb66942efc847e63"

RPROVIDES:${PN} += "ghc-devel-hslua-module-version-1.2.0.1-7Ta1Mn5URCJ9Pe3cHjwQh \
ghc-hslua-module-version-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-devel-hslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o \
ghc-devel-hslua-packaging-2.4.1-1RYRM22n0e3FXJMrP5sdLA \
ghc-devel-text-2.1.4-cf23 \
ghc-hslua-module-version"

inherit rpm
