SUMMARY = "Haskell glib library development files"
DESCRIPTION = "This package provides the Haskell glib library development files."
LICENSE = "LGPL-2.1-only"

PV = "0.13.12.0"

RPM_NAME = "ghc-glib-devel-0.13.12.0-2.3.aarch64.rpm"
RPM_HASH = "086511448614ebe2e58873ac0e945a0f7e35a83d0c9fede6a8f4de4fbb765fac1d83b8186bdefee3b88d205a761ad5f7f8bf62455ab2cc8b2f0abf497b7dec09"

RPROVIDES:${PN} += "ghc-devel-glib-0.13.12.0-ARZovtA2xnqKsDZ2Db5KU2 \
ghc-glib-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-glib \
pkgconfig \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
