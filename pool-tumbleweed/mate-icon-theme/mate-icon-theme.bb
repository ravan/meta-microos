SUMMARY = "MATE icon theme"
DESCRIPTION = "This package contains the default icon theme used by the MATE desktop. \
The icons are used in the panel menu, and in nautilus and other \
applications, to represent the different applications, files, \
directories, and devices."
LICENSE = "CC-BY-3.0 & LGPL-3.0-only"

PV = "1.28.0"

RPM_NAME = "mate-icon-theme-1.28.0-2.3.noarch.rpm"
RPM_HASH = "2e3c50ab55f7fd87b26bf448bb2c2fb5d9c99d98d422878ac46f7fe190316db3faf4443c869aec5ee544cf99a838524ae45823745b244249eeb79d3a18dc2aaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-icon-theme \
mate-icon-theme-devel"

RDEPENDS:${PN} += ""

inherit rpm
