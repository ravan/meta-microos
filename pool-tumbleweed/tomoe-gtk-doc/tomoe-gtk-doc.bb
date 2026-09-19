SUMMARY = "TOMOE GTK+ library"
DESCRIPTION = "TOMOE GTK+ library"
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "tomoe-gtk-doc-0.6.0-45.6.aarch64.rpm"
RPM_HASH = "f1aa6e157d355c7468ff0f18cd79888620582474bf07248193cdc86e3f7d40f68939b566463b467b5b017814f4f0e5695cb70823718fffe3cfb08f7335ca49e2"

RPROVIDES:${PN} += "tomoe-gtk-doc"

RDEPENDS:${PN} += "tomoe-gtk"

inherit rpm
