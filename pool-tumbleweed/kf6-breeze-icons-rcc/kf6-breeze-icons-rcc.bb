SUMMARY = "Breeze icon theme - rcc file"
DESCRIPTION = "Breeze-icons is a freedesktop.org compatible icon theme. \
This contains the Breeze (non-dark) icons in a QResource file, used by Kexi."
LICENSE = "LGPL-3.0-only"

PV = "6.30.0"

RPM_NAME = "kf6-breeze-icons-rcc-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "50af627e3b8ab419343f332a2615567f67840104662a584c58ffef160befcc5a6f2861571a617b1f76e1c970bb1bd8f29e0fd44fb9330a3aa1e21fba1d6f0b99"

RPROVIDES:${PN} += "breeze5-icons-rcc \
kf6-breeze-icons-rcc"

RDEPENDS:${PN} += ""

inherit rpm
