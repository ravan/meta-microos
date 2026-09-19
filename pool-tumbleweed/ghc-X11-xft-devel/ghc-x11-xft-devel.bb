SUMMARY = "Haskell X11-xft library development files"
DESCRIPTION = "This package provides the Haskell X11-xft library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-X11-xft-devel-0.3.4-2.21.aarch64.rpm"
RPM_HASH = "0d4227febba9bdb6c84db7d5f02dd9aa5d44c2b7448bb5f3e479125c7cc643a3d38c1067ba9d491fab54a3d0891bc8e38c47dc171dc514446d85e59bb5b74c8a"

RPROVIDES:${PN} += "ghc-X11-xft-devel \
ghc-devel-X11-xft-0.3.4-C3us4A75PM8AtwtgFqRfgr"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-X11-xft \
ghc-compiler \
ghc-devel-X11-1.10.3-1WMJghU3kQXBmOfIIGE3Rk \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
pkgconfig \
pkgconfig-xft"

inherit rpm
