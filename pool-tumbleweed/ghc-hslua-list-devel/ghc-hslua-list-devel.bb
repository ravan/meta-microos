SUMMARY = "Haskell hslua-list library development files"
DESCRIPTION = "This package provides the Haskell hslua-list library development files."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "ghc-hslua-list-devel-1.1.4-1.13.aarch64.rpm"
RPM_HASH = "3f44e4a886d745b046fc0bf9f706569b174cb745973b2b282bfa7a310ed8cc9f459765b8b07f0df232669b244ed1bf4c936b3f53ee398f9cdc2c91f8090adf24"

RPROVIDES:${PN} += "ghc-devel-hslua-list-1.1.4-2iYtswPM1Oh6QVQjUY3AZP \
ghc-hslua-list-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-hslua-list"

inherit rpm
