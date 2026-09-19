SUMMARY = "Haskell fast-logger library development files"
DESCRIPTION = "This package provides the Haskell fast-logger library development files."
LICENSE = "BSD-3-Clause"

PV = "3.2.6"

RPM_NAME = "ghc-fast-logger-devel-3.2.6-1.11.aarch64.rpm"
RPM_HASH = "3ef8a4ce824e64ffbe9c7861adb9be061943cc975be91964f638e0f7395bd24812c60c557544ec93b68a4ba19676ac9984dc3648ac0ef3706d3d7cb96cc514b9"

RPROVIDES:${PN} += "ghc-devel-fast-logger-3.2.6-JkXOEB4fbDV8mDlAr0wMkH \
ghc-fast-logger-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-auto-update-0.2.6-2tH9dVxiiOkBVROYgrOYPc \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-easy-file-0.2.5-HaH29sPzevuLIcTD4Zvwg0 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-unix-compat-0.7.4.1-4v781Gok1KY8Kg7jV1j1vn \
ghc-devel-unix-time-0.4.17-BauOeKKKj6kENMTfxOVI2q \
ghc-fast-logger"

inherit rpm
