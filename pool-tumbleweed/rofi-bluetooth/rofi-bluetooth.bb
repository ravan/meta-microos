SUMMARY = "Bluetooth manager for rofi"
DESCRIPTION = "Bluetooth device and connection manager for use with rofi"
LICENSE = "GPL-3.0-only"

PV = "0+git.1745170630.9f2b944"

RPM_NAME = "rofi-bluetooth-0+git.1745170630.9f2b944-1.3.noarch.rpm"
RPM_HASH = "14e685a5c56bb430cf9a0e508ed832e7347c3cfa7654f3367f9976e3f0d6234474c4fe00182d166f0a718a654def0861c25398532887f48a5157e19202f798a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rofi-bluetooth"

RDEPENDS:${PN} += "/usr/bin/sh \
bluez"

inherit rpm
