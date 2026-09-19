SUMMARY = "Haskell hslua-module-zip library development files"
DESCRIPTION = "This package provides the Haskell hslua-module-zip library development \
files."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "ghc-hslua-module-zip-devel-1.2.1-1.3.aarch64.rpm"
RPM_HASH = "5f12fbac3ca51285b07b04421f71c23e3a9196efec7492f576ce6e66c58d805dbc137eb066b5c69f863c35f4cd814a1d6f221feff32e66e056dfe10b8c1cb59f"

RPROVIDES:${PN} += "ghc-devel-hslua-module-zip-1.2.1-FF7qqe9nCmKFvC25WW3iJH \
ghc-hslua-module-zip-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-devel-hslua-list-1.1.4-2iYtswPM1Oh6QVQjUY3AZP \
ghc-devel-hslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o \
ghc-devel-hslua-packaging-2.4.1-1RYRM22n0e3FXJMrP5sdLA \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-time-1.14-a7dc \
ghc-devel-zip-archive-0.4.3.2-7LOPKgQ3Ei9AA5FjkJE7vc \
ghc-hslua-module-zip"

inherit rpm
