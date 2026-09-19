SUMMARY = "Systemd integration for Clevis"
DESCRIPTION = "Automatically unlock LUKS devices in /etc/crypttab with Clevis."
LICENSE = "GPL-3.0-or-later"

PV = "21"

RPM_NAME = "clevis-systemd-21-1.6.aarch64.rpm"
RPM_HASH = "fb1b170c1c6526d93a9ce54ad38bc237e2a00e6d08ded8a60a87428cd10929025e18cd3b147974dd827fba405657f139bc9888919815e86548e033ecd12b8838"

RPROVIDES:${PN} += "clevis-systemd"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
clevis-luks \
systemd"

inherit rpm
