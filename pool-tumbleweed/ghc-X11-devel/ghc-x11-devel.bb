SUMMARY = "Haskell X11 library development files"
DESCRIPTION = "This package provides the Haskell X11 library development files."
LICENSE = "BSD-3-Clause"

PV = "1.10.3"

RPM_NAME = "ghc-X11-devel-1.10.3-5.11.aarch64.rpm"
RPM_HASH = "9e08978175a0eb1bcf8115179ed5aa6ea6de8928c0e16615b0dadd9a9fe3186fe916a4efd302785d865a84814986fa704b03d5049f5871598a04335828ab8fcd"

RPROVIDES:${PN} += "ghc-X11-devel \
ghc-devel-X11-1.10.3-1WMJghU3kQXBmOfIIGE3Rk"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-X11 \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-data-default-class-0.2.0.0-3moOzwNUrN6FLgYZMunU62 \
pkgconfig-x11 \
pkgconfig-x11-xcb \
pkgconfig-xext \
pkgconfig-xinerama \
pkgconfig-xrandr \
pkgconfig-xscrnsaver"

inherit rpm
