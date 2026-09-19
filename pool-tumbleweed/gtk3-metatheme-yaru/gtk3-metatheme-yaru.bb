SUMMARY = "GTK+ 3 support for the Yaru Gtk Theme"
DESCRIPTION = "This is the theme shaped by the community on the Ubuntu hub. \
 \
This package provides the GTK+ 3 support for Yaru theme."
LICENSE = "CC-BY-SA-4.0 & GPL-3.0-or-later & LGPL-2.1-only & LGPL-3.0-only"

PV = "24.04.0"

RPM_NAME = "gtk3-metatheme-yaru-24.04.0-1.9.noarch.rpm"
RPM_HASH = "85d6a5812a68507c2a4772e9f0ba28bfcbe6650811c50fe59c01c5baf13f245298ba3e78781f4e767400503f191dcfa0729b7787992390e9039b4a1818614ec9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-yaru"

RDEPENDS:${PN} += "gtk3 \
metatheme-yaru-common"

inherit rpm
