SUMMARY = "UHD udev rules"
DESCRIPTION = "The UHD is the 'Universal Software Radio Peripheral' hardware driver. \
The goal of the UHD is to provide a host driver and API for current \
and future Ettus Research products. Users will be able to use the \
UHD driver standalone or with 3rd party applications. \
 \
This package contains udev rules for UHD."
LICENSE = "GPL-3.0-or-later"

PV = "4.10.0.0"

RPM_NAME = "uhd-udev-4.10.0.0-2.1.aarch64.rpm"
RPM_HASH = "3268ab6c780d951f842b02fa2f60099cfa33667e391451db10b2e27a1bf119caa56c5ddfb69913fc0bf10c818a2d80272eb97f5fe2071cae9c2412138a6ca630"

RPROVIDES:${PN} += "uhd-udev"

RDEPENDS:${PN} += ""

inherit rpm
