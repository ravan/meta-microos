SUMMARY = "Industrial Metatheme for GNOME"
DESCRIPTION = "Metatheme for GNOME: Industrial strength WM theme for Metacity and \
Industrial icon theme for GNOME."
LICENSE = "GPL-2.0-only"

PV = "0.6.5"

RPM_NAME = "gtk2-metatheme-industrial-0.6.5-72.20.noarch.rpm"
RPM_HASH = "47dc2329ce2b9169e38d71839b40cd7356cf7cdb9405a0634f82f1e70b51b2a838ab6ad674b5b86e4d9016982c9feccfb2e1843af767c560bd816ebc261f03b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-themes-/usr/share/themes/Industrial/index.theme \
gtk2-metatheme-industrial"

RDEPENDS:${PN} += "gtk2-engine-industrial \
gtk2-metatheme-gilouche \
gtk2-theme-industrial"

inherit rpm
