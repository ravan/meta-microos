SUMMARY = "SUSE specific hardware tuning rules"
DESCRIPTION = "This package contains SUSE specific hardware tunings common to all SUSE brands."
LICENSE = "GPL-2.0-or-later"

PV = "0.2"

RPM_NAME = "udev-extra-rules-0.2-1.15.noarch.rpm"
RPM_HASH = "c15dd0816cd96340626ef65b5de40449a6774693dcd98a2521b865eda2eff9ceda4f6d693c4b64bb3de518f4c48ae35f73047e262857643543269024a91c1c1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "system-tuning-common-SUSE \
udev-extra-rules"

RDEPENDS:${PN} += "/usr/bin/sh \
systemd"

inherit rpm
