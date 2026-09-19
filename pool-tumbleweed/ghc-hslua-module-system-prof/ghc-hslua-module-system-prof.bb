SUMMARY = "Haskell hslua-module-system profiling library"
DESCRIPTION = "This package provides the Haskell hslua-module-system profiling library."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "ghc-hslua-module-system-prof-1.3.0-1.3.aarch64.rpm"
RPM_HASH = "5c8de97aa2d731d449ce8a53e388ab5fd9940a974a1798e279a60d71b45c7e4199978e390c2ff78dc3dda722fb397ea499b24f032d13e7b2cb870fc32479af03"

RPROVIDES:${PN} += "ghc-hslua-module-system-prof \
ghc-prof-hslua-module-system-1.3.0-JmXccm8tEh45eiVMZhLzZ2"

RDEPENDS:${PN} += "ghc-hslua-module-system-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-prof-hslua-list-1.1.4-2iYtswPM1Oh6QVQjUY3AZP \
ghc-prof-hslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o \
ghc-prof-hslua-packaging-2.4.1-1RYRM22n0e3FXJMrP5sdLA \
ghc-prof-process-1.6.26.1-905d \
ghc-prof-temporary-1.3-2Osk9MNG2oU9jER7tTbSTz \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-time-1.14-a7dc"

inherit rpm
