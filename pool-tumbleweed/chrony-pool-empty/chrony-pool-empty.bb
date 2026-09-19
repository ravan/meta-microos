SUMMARY = "Empty pool preconfiguration for chrony"
DESCRIPTION = "This package provides an empty /etc/chrony.d/pool.conf file for \
situations when having servers preconfigured in chrony is undesirable, \
e.g. because the servers will be set via DHCP."
LICENSE = "GPL-2.0-only"

PV = "4.9"

RPM_NAME = "chrony-pool-empty-4.9-2.1.noarch.rpm"
RPM_HASH = "ee2e807824199cb6be1320d1d54a06226f7f7dd56f1356fe037ae29839a6edd710962780b13b542b181db0d9668464049ca3a9e4d62635a319414b84533d01de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chrony-pool \
chrony-pool-empty"

RDEPENDS:${PN} += "/usr/bin/sh \
chrony"

inherit rpm
