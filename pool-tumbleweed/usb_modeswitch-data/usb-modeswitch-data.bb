SUMMARY = "Data Files for USB Modeswitch"
DESCRIPTION = "Data files for usb_modeswitch package."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.1"

RPM_NAME = "usb_modeswitch-data-2.6.1-4.5.noarch.rpm"
RPM_HASH = "fe5397a9a4e9f7a20a88585e062a74aa252628b3b9102f7ae8a13f714a355d01da9d10aecc2052f0d1adb9292e919d62e163fc432c4ce409ad32c0c622341c5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "usb-modeswitch-data"

RDEPENDS:${PN} += "usb-modeswitch"

inherit rpm
