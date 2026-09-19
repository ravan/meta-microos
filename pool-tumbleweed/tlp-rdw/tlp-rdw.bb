SUMMARY = "TLP Radio Device Wizard"
DESCRIPTION = "Radio device wizard is an add-on to TLP. It provides event based \
switching of Bluetooth, NFC, Wi-Fi and WWAN radio devices on: \
 - network connect/disconnect \
 - dock/undock"
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.10.2"

RPM_NAME = "tlp-rdw-1.10.2-1.1.noarch.rpm"
RPM_HASH = "3fef59794a94f51aaa461b77ce235999cca9934932b6e5d1fa86167d68f0431cd7b7493ce02971456c025cfc249d659c459ebe4c0186dba3adc8597fb72df72e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tlp-rdw"

RDEPENDS:${PN} += "/usr/bin/sh \
NetworkManager \
systemd \
tlp"

inherit rpm
