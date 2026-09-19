SUMMARY = "Haskell terminfo library development files"
DESCRIPTION = "This package provides the Haskell terminfo library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.7"

RPM_NAME = "ghc-terminfo-devel-0.4.1.7-1.3.aarch64.rpm"
RPM_HASH = "a395311b0cc3f7599008e4ae03f0b5c22fffb0f6d0677df6065091ab466133638e284e533713220817ef68f884cead0de8a02e06fdfb7a362dd3cbb857fa2662"

RPROVIDES:${PN} += "ghc-devel-terminfo-0.4.1.7-3afa \
ghc-terminfo-devel \
ghc-terminfo-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-terminfo \
ncurses-devel"

inherit rpm
