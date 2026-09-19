SUMMARY = "Udev rules for VPD Database access library"
DESCRIPTION = "Udev rules for libvpd library used to access a vpd database created by \
vpdupdate in the lsvpd package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.11"

RPM_NAME = "libvpd-base-2.2.11-1.4.aarch64.rpm"
RPM_HASH = "40850d4414718ffd0713f8444374ffe9972ead4a02c5483a771ea1042ea24f56fe6e869a6a21fd0a678cfb2068fbc069d860215d5f94ef3926a4525d8ae75daa"

RPROVIDES:${PN} += "libvpd-base"

RDEPENDS:${PN} += ""

inherit rpm
