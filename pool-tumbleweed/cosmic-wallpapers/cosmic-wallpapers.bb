SUMMARY = "Wallpapers for the COSMIC Desktop Environment"
DESCRIPTION = "Wallpapers for the COSMIC Desktop Environment."
LICENSE = "CC-BY-4.0 | CC0-1.0"

PV = "1.0.8"

RPM_NAME = "cosmic-wallpapers-1.0.8-1.2.aarch64.rpm"
RPM_HASH = "aa4441c3665f5b971f8875e317aa65882cba276a31f6f637dafa583d7e632f64e4058057ff1b1524d241a58ac483f25ec75a96441ffde3128455e794faa8d657"

RPROVIDES:${PN} += "cosmic-wallpapers"

RDEPENDS:${PN} += ""

inherit rpm
