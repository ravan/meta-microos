SUMMARY = "Nagios Core web interface"
DESCRIPTION = "Exfoliation is a simple makeover for the Nagios Core web interface. It consists \
of two folders that overlay on a stock Nagios installation."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.12"

RPM_NAME = "nagios-theme-exfoliation-4.5.12-2.1.noarch.rpm"
RPM_HASH = "af0a3ccf101d8c7e05a06b50f6b88518bb56e5854d8ed075d15374787324b3e8c3376effb79e8fceef00baac9c6d8af997f863e876c51adff6b853bc68119b1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nagios-theme-exfoliation"

RDEPENDS:${PN} += "/usr/bin/sh \
nagios-theme-switcher \
nagios-www"

inherit rpm
