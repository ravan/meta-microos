SUMMARY = "Haskell cairo library development files"
DESCRIPTION = "This package provides the Haskell cairo library development files."
LICENSE = "BSD-3-Clause"

PV = "0.13.12.0"

RPM_NAME = "ghc-cairo-devel-0.13.12.0-1.12.aarch64.rpm"
RPM_HASH = "08853f856e2ca22e6dad38ac50628c772fdd4a5d8e9e63d222c7b24cdd11720cd6e3309553dfa1cdbe2d86d67faf676277036827309960ac3a2161ab4ad7baf2"

RPROVIDES:${PN} += "ghc-cairo-devel \
ghc-devel-cairo-0.13.12.0-4t6EsC3Gqxb9Xow3SHIyd2"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cairo \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
pkgconfig \
pkgconfig-cairo \
pkgconfig-cairo-pdf \
pkgconfig-cairo-ps \
pkgconfig-cairo-svg"

inherit rpm
