SUMMARY = "Chrony preconfiguration for openSUSE"
DESCRIPTION = "This package configures chrony to use the openSUSE NTP server pool by \
default."
LICENSE = "GPL-2.0-only"

PV = "4.9"

RPM_NAME = "chrony-pool-openSUSE-4.9-2.1.noarch.rpm"
RPM_HASH = "508eb3d5e1673d029a44f345b05fae88654dc768a9f687ee71372638acf2864899066465c384bc65f936a5978b34dcef8380a7f6b1df9a0816cb3e026a1d84e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chrony-pool \
chrony-pool-nonempty \
chrony-pool-openSUSE"

RDEPENDS:${PN} += "/usr/bin/sh \
chrony"

inherit rpm
