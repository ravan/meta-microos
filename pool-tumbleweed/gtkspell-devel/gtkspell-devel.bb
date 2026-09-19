SUMMARY = "Static libraries and header files from gtkspell"
DESCRIPTION = "Static libraries and header files from gtkspell."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.16"

RPM_NAME = "gtkspell-devel-2.0.16-25.4.aarch64.rpm"
RPM_HASH = "d0750d307ca0a47aa4dfd7a37bbe9034631db6b2dea83df55adc0717bf3e84c0c6397e7b1de85aefe3b536b9ffc84732abf217f002ce60adbf069a4995d13973"

RPROVIDES:${PN} += "gtkspell-devel \
pkgconfig-gtkspell-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtkspell0 \
pkgconfig-gtk+-2.0"

inherit rpm
