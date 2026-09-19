SUMMARY = "Plug-Ins which depend on additional packages"
DESCRIPTION = "These are additional monitoring checks that require additional packages \
which have to be installed."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-extras-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "3d75c61de79c172c8ab323b6b64f3efae8a60b74a920c7929a1874a5e2f2e65d5a673a90e17732dc17eba56975d6885ebcc1a887bcc5067ac460aa66978c9105"

RPROVIDES:${PN} += "monitoring-plugins-extras \
nagios-plugins-extras"

RDEPENDS:${PN} += "monitoring-plugins-common"

inherit rpm
