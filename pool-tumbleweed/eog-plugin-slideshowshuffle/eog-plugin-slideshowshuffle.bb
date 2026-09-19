SUMMARY = "Eog slideshowshuffle plugin"
DESCRIPTION = "The Eye of Gnome Slideshow Shuffle plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "eog-plugin-slideshowshuffle-44.1-2.3.aarch64.rpm"
RPM_HASH = "06497241ea635596aaa1500158efd8b590ade96878e07254ecc23649faf00fad8dffa964f68d869fdbfa3e349ba9e7874ead7222d6942fb8a6e78a3c5c4a0172"

RPROVIDES:${PN} += "eog-plugin-slideshowshuffle \
eog-plugins-/usr/lib64/eog/plugins/slideshowshuffle.plugin"

RDEPENDS:${PN} += "eog-plugins-data"

inherit rpm
