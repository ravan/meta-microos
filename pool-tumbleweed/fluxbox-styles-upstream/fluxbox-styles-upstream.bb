SUMMARY = "Upstream bundle of styles for fluxbox"
DESCRIPTION = "Fluxbox is a stacking windowmanager for the X Window System which \
started as a fork of Blackbox 0.61.1 in 2001. Its user interface has \
only a taskbar, a pop-up menu accessible by right-clicking on the \
desktop, and minimal support for graphical icons. \
 \
This package provides the upstream bundle of styles."
LICENSE = "MIT"

PV = "1.3.7"

RPM_NAME = "fluxbox-styles-upstream-1.3.7-2.10.noarch.rpm"
RPM_HASH = "09872e0093d05f07d9cb7e74b42a9da0d4e28e4c9582723060dc7fb341ddd7f66fca5a80725b40e4195ab8bb31c630aecf5b99d313aefcdacc6a91db88847c4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fluxbox-styles-upstream"

RDEPENDS:${PN} += "fluxbox"

inherit rpm
