SUMMARY = "Chrony preconfiguration for SUSE"
DESCRIPTION = "This package configures chrony to use the SUSE NTP server pool by \
default."
LICENSE = "GPL-2.0-only"

PV = "4.9"

RPM_NAME = "chrony-pool-suse-4.9-2.1.noarch.rpm"
RPM_HASH = "69160bcd42cbd2d7b9284d13bb06d12cf60589587a774d2e3b6b0a27d3e2a456d3c7780a3dadb0bd633efb0c11239c6b5a7e5b8f2a0bc80e31992a3aa594d9a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chrony-pool \
chrony-pool-nonempty \
chrony-pool-suse"

RDEPENDS:${PN} += "/usr/bin/sh \
chrony"

inherit rpm
