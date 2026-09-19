SUMMARY = "Development files for osmo-fl2k"
DESCRIPTION = "Library headers for osmo-fl2k driver."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.1+git.20250902"

RPM_NAME = "osmo-fl2k-devel-0.2.1+git.20250902-1.6.aarch64.rpm"
RPM_HASH = "10dff60b1e6cf2dc25a4d7ab0514b45d047664c7476b621aecac4e656e9ef99d395463be290bf395e9844e0490afbc320f79f0987b2eeb61abb5feed434441c4"

RPROVIDES:${PN} += "osmo-fl2k-devel \
pkgconfig-libosmo-fl2k"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
osmo-fl2k"

inherit rpm
