SUMMARY = "Haskell hslua-module-system library development files"
DESCRIPTION = "This package provides the Haskell hslua-module-system library development \
files."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "ghc-hslua-module-system-devel-1.3.0-1.3.aarch64.rpm"
RPM_HASH = "ecd0b14e74a7547a9685ec16d63476e50e9bd083787c005d81833a40854c65fb1d99ee6414c0d4c1095eb42f6f35f46d7c5fb8e21f226a4e6e8ba55dbec475af"

RPROVIDES:${PN} += "ghc-devel-hslua-module-system-1.3.0-JmXccm8tEh45eiVMZhLzZ2 \
ghc-hslua-module-system-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-devel-hslua-list-1.1.4-2iYtswPM1Oh6QVQjUY3AZP \
ghc-devel-hslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o \
ghc-devel-hslua-packaging-2.4.1-1RYRM22n0e3FXJMrP5sdLA \
ghc-devel-process-1.6.26.1-905d \
ghc-devel-temporary-1.3-2Osk9MNG2oU9jER7tTbSTz \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-time-1.14-a7dc \
ghc-hslua-module-system"

inherit rpm
