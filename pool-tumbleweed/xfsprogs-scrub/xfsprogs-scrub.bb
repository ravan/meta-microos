SUMMARY = "XFS scrubbing scripts and service files"
DESCRIPTION = "Scripts and systemd service files for background scrubbing of metadata \
on xfs filesystems."
LICENSE = "GPL-2.0-or-later"

PV = "6.19.0"

RPM_NAME = "xfsprogs-scrub-6.19.0-1.5.aarch64.rpm"
RPM_HASH = "0fa4dbf98cdb984a3195fbf6bd8d541334e65c6dcafc946f8da39439565b72a8c96f6931decf501f7108023f1cbbd47d34b40d79bebdeb40f225e205017f754e"

RPROVIDES:${PN} += "xfsprogs-scrub"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
xfsprogs"

inherit rpm
