SUMMARY = "Development files for the Nextcloud synchronisation library"
DESCRIPTION = "Development files for the Nextcloud Desktop Client synchronisation \
library."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "34.0.3"

RPM_NAME = "libnextcloudsync-devel-34.0.3-1.1.aarch64.rpm"
RPM_HASH = "e537c8a690078be9682948e58787f965652f842db4bdcb9093d0eb09d5bc5d5b91c5c15e5bb2b9a34338d814110a07b5b194963f51d9e0840364228fdf3c0ed6"

RPROVIDES:${PN} += "libnextcloudsync-devel"

RDEPENDS:${PN} += "libnextcloudsync0"

inherit rpm
