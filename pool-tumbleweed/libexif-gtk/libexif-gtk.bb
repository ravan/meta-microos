SUMMARY = "GTK Widgets for Viewing EXIF Information"
DESCRIPTION = "This library contains GTK widgets for viewing EXIF information within \
JPEG images created by some digital cameras."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "libexif-gtk-0.5.0-2.6.aarch64.rpm"
RPM_HASH = "2c0df9e00f98bfe0b33e3123f064939fe828737561e349fbf5210999409be9cf8e79feee6f1012ed6259a60d3310e2d515f83451d1c8da9b871b1cea00b29343"

RPROVIDES:${PN} += "libexif-gtk"

RDEPENDS:${PN} += "libexif-gtk5"

inherit rpm
