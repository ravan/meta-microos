SUMMARY = "Development files for kime"
DESCRIPTION = "Development files (headers and library) for kime Korean Input Method Engine."
LICENSE = "GPL-3.0-or-later"

PV = "3.1.1"

RPM_NAME = "kime-devel-3.1.1-2.12.aarch64.rpm"
RPM_HASH = "9614644e78a6172c9221e29c79c5c8693034a38cffc10d94504d5658557728e093ecd83333b4ea923039ffedbd9e6cb24adb7c25fe8015501b2c4ce0d015ef60"

RPROVIDES:${PN} += "kime-devel"

RDEPENDS:${PN} += "kime"

inherit rpm
