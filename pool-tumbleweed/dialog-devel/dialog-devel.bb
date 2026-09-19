SUMMARY = "Menus and Input Boxes for Shell Scripts"
DESCRIPTION = "This program lets you use menus and dialog boxes in shell scripts."
LICENSE = "LGPL-2.1-only"

PV = "1.3"

RPM_NAME = "dialog-devel-1.3-14.1.aarch64.rpm"
RPM_HASH = "981a08b998da0e9a4a0ee1296e48ef278d80cf78b2ed731a8ea115fe51b573e126dc7664b975dbdf1b28654a0c8f51bc1ae179adc08df460f0db7c2f6b286d5e"

RPROVIDES:${PN} += "dialog-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
libdialog15"

inherit rpm
