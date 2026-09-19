SUMMARY = "Haskell time-manager library development files"
DESCRIPTION = "This package provides the Haskell time-manager library development files."
LICENSE = "MIT"

PV = "0.2.4"

RPM_NAME = "ghc-time-manager-devel-0.2.4-1.7.aarch64.rpm"
RPM_HASH = "5a4f3dbd5909a4f2b0f69d684e346f361adb28369a33a4574c1e1a9b18b788fff4072ff0195ab407e4d18aab5801fdf3c734fed6eb4b1bf21f1ff42034d4875b"

RPROVIDES:${PN} += "ghc-devel-time-manager-0.2.4-H8vBuVTBThX7XPtYuadAK4 \
ghc-time-manager-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-auto-update-0.2.6-2tH9dVxiiOkBVROYgrOYPc \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-time-manager"

inherit rpm
