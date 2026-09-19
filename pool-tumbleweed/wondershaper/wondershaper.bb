SUMMARY = "A network QoS (Quality of Service) script"
DESCRIPTION = "Many cablemodem and ADSL users experience horrifying latency while \
uploading or downloading. They also notice that uploading hampers \
downloading greatly. The wondershaper neatly addresses these issues, \
allowing users of a router with a wondershaper to continue using SSH \
over a loaded link happily."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1+git.20211015"

RPM_NAME = "wondershaper-1.4.1+git.20211015-1.13.noarch.rpm"
RPM_HASH = "ec317123d741bf0c3c6062b7c7ed84101787ec9a0b9e214c5ae4f6ec79ed05f07b467625a3d0478b375306996f09832622a7312c15072db4271b5d8df13898aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-wondershaper \
wondershaper"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
iproute2"

inherit rpm
