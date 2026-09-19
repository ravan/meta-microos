SUMMARY = "Udev rules for osmo-fl2k"
DESCRIPTION = "Udev rules for osmo-fl2k."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.1+git.20250902"

RPM_NAME = "osmo-fl2k-udev-0.2.1+git.20250902-1.6.aarch64.rpm"
RPM_HASH = "1f5c2521af78b23998e8c838b4f31e5b8a71e9119adf9359320a466621734fe38be3099a35641ba472b59409e5a857d9e57d43793bfe4051a31f9ef8fd63efdd"

RPROVIDES:${PN} += "osmo-fl2k-udev"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
